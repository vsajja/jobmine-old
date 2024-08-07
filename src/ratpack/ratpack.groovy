import com.zaxxer.hikari.HikariConfig
import jooq.generated.tables.pojos.Job
import jooq.generated.tables.pojos.JobApp
import jooq.generated.tables.pojos.User
import org.job.JobmineService
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ratpack.groovy.sql.SqlModule
import ratpack.handling.RequestLogger
import ratpack.hikari.HikariModule
import org.job.postgres.PostgresConfig
import org.job.postgres.PostgresModule

import javax.sql.DataSource

import static ratpack.groovy.Groovy.ratpack
import static ratpack.jackson.Jackson.json
import static ratpack.jackson.Jackson.jsonNode

import static jooq.generated.Tables.*;

final Logger log = LoggerFactory.getLogger(this.class)

ratpack {
    serverConfig {
        props("db.properties")
        require("/postgres", PostgresConfig)
    }

    bindings {
        module HikariModule, { HikariConfig config ->
            config.setMaximumPoolSize(3)
            config.dataSource = new PostgresModule().dataSource(serverConfig.get('/postgres', PostgresConfig))
        }
        module SqlModule
        bind JobmineService
    }

    handlers { JobmineService jobService ->
        all RequestLogger.ncsa(log)

        all {
            String forwardedProto = 'X-Forwarded-Proto'
            if (request.headers.contains(forwardedProto)
                    && request.headers.get(forwardedProto) != 'https') {
                redirect(301, "https://${request.headers.get('Host')}${request.rawUri}")
            } else {
                next()
            }
        }

        all {
            response.headers.add('Access-Control-Allow-Origin', '*')
            response.headers.add('Access-Control-Allow-Headers', 'origin, x-requested-with, content-type, Authorization')
            response.headers.add('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS')
            next()
        }

        ['login',
         'home'
        ].each { path ->
            get(path) {
                response.contentType('text/html').send new File(this.class.getResource('dist/index.html').toURI()).text
            }
        }

        path('login') {
            byMethod {
                post {
                    parse(jsonNode()).map { params ->
                        def username = params.get('username')?.textValue()
                        def password = params.get('password')?.textValue()

                        assert username
                        assert password

                        jobService.login(username, password)
                    }.onError { Exception e ->
                        if (e instanceof IllegalArgumentException) {
                            clientError(401)
                        }
                        else {
                            clientError(401)
                        }
                        e.printStackTrace()
                    }.then { User user ->
                        if (user) {
                            render json(user)
                        } else {
                            clientError(404)
                        }
                    }
                }
            }
        }

        post('register') {
            parse(jsonNode()).map { params ->
                def username = params.get('username')?.textValue()
                def password = params.get('password')?.textValue()

                jobService.register(username, password)
            }.onError { Throwable e ->
                if (e.message.contains('unique constraint')) {
                    clientError(409)
                }
                throw e
            }.then { User user ->
                render json(user)
            }
        }

        prefix('api/v1') {
            path('jobs') {
                byMethod {
                    get {
                        String query = request.queryParams.q?.toLowerCase()
                        String location = request.queryParams.l?.toLowerCase()

                        DataSource dataSource = registry.get(DataSource.class)
                        DSLContext context = DSL.using(dataSource, SQLDialect.POSTGRES)

                        def jobsQ = context.selectFrom(JOB).limit(100)
                        if (query) {
                            jobsQ.where(DSL.lower(JOB.TITLE).like("%$query%"))
                            jobsQ.or(DSL.lower(JOB.COMPANY).like("%$query%"))
                        }
                        if (location) {
                            jobsQ.where(DSL.lower(JOB.LOCATION).like("%$location%"))
                        }

                        jobsQ.orderBy(JOB.CREATED_TIMESTAMP.desc())

                        List<Job> jobs = jobsQ.fetch().into(Job.class)
                        render json(jobs)
                    }
                }
            }

            path('jobs/:jobId') {
                def jobId = pathTokens['jobId']
                byMethod {
                    get {
                        DataSource dataSource = registry.get(DataSource.class)
                        DSLContext context = DSL.using(dataSource, SQLDialect.POSTGRES)
                        Job job = context.selectFrom(JOB)
                                .where(JOB.JOB_ID.equal(jobId))
                                .fetchOne()
                                .into(Job.class)
                        render json(job)
                    }
                }
            }

            path('users/:username') {
                def username = pathTokens['username']
                byMethod {
                    get {
                        User user = jobService.getUser(username)
                        render json(user)
                    }
                }
            }

            path('users/:userId/shortlist') {
                String userId = pathTokens['userId']
                byMethod {
                    get {
                        def shortlist = jobService.getJobShortlist(userId)
                        render json(shortlist)
                    }
                }
            }

            path('users/:userId/shortlist/:jobId') {
                def userId = pathTokens['userId']
                def jobId = pathTokens['jobId']
                byMethod {
                    post {
                        jobService.shortlist(userId, jobId)
                        response.send()
                    }
                }
            }

            path('users/:userId/apps') {
                String userId = pathTokens['userId']
                byMethod {
                    get {
                        def jobApps = jobService.getJobApps(userId)
                        render json(jobApps)
                    }
                }
            }

            path('users/:userId/apply/:jobId') {
                def userId = pathTokens['userId']
                def jobId = pathTokens['jobId']
                byMethod {
                    post {
                        jobService.apply(userId, jobId)
                        response.send()
                    }
                }
            }
        }

        files {
            dir 'dist'
            indexFiles 'index.html'
        }
    }
}
