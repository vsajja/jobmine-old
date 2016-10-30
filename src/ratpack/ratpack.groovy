import com.zaxxer.hikari.HikariConfig
import groovy.json.JsonSlurper
import jooq.tables.daos.JobPostingDao
import jooq.tables.daos.SchoolDao
import jooq.tables.daos.StudentDao
import jooq.tables.pojos.JobPosting
import jooq.tables.pojos.School
import jooq.tables.pojos.Student
import org.jooq.Configuration
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.jooq.impl.DefaultConfiguration
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ratpack.config.ConfigData
import ratpack.config.ConfigDataBuilder
import ratpack.groovy.sql.SqlModule
import ratpack.handling.RequestLogger
import ratpack.hikari.HikariModule
import ratpack.http.client.HttpClient
import vsajja.org.postgres.PostgresConfig
import vsajja.org.postgres.PostgresModule
import vsajja.org.redis.RedisConfig

import javax.sql.DataSource
import java.sql.Date
import java.text.NumberFormat
import java.text.SimpleDateFormat

import static ratpack.groovy.Groovy.ratpack
import static ratpack.jackson.Jackson.json

import static jooq.Tables.*;

final Logger log = LoggerFactory.getLogger(this.class)

ratpack {
    bindings {
        final ConfigData configData = ConfigData.of { ConfigDataBuilder builder ->
            builder.props(
                    ['postgres.user'        : 'zoqyxwbxjuntzp',
                     'postgres.password'    : 'sfXLiNPmZuRUxS_biBDNyNRhDh',
                     'postgres.portNumber'  : 5432,
                     'postgres.databaseName': 'd4ogiv1q9mi0tp',
                     'postgres.serverName'  : 'ec2-54-243-249-65.compute-1.amazonaws.com',
                     'redis.host'           : 'pub-redis-19472.us-east-1-2.5.ec2.garantiadata.com',
                     'redis.portNumber'     : 19472,
                     'redis.password'       : 'sfXLiNPmZuRUxS_biBDNyNRhDh'])
            builder.build()
        }

        bindInstance PostgresConfig, configData.get('/postgres', PostgresConfig)
        bindInstance RedisConfig, configData.get('/redis', RedisConfig)

        module HikariModule, { HikariConfig config ->
            config.dataSource =
                    new PostgresModule().dataSource(
                            configData.get('/postgres', PostgresConfig))
        }
        module SqlModule
    }

    handlers {
        all RequestLogger.ncsa(log)

        get {
            println "/ ${new SimpleDateFormat('yyyy-MM-dd HH:mm:ss.SSS').format(new java.util.Date())}"
            render 'Hello world!'
        }

        prefix('api/v1') {
            get('jobs') {
                response.headers.add('Access-Control-Allow-Origin', '*')
                DataSource dataSource = registry.get(DataSource.class)
                Configuration configuration = new DefaultConfiguration().set(dataSource).set(SQLDialect.POSTGRES)
                List<JobPosting> jobPostings = new JobPostingDao(configuration).findAll()
                render json(jobPostings)
            }

            get('schools') {
                response.headers.add('Access-Control-Allow-Origin', '*')
                DataSource dataSource = registry.get(DataSource.class)
                Configuration configuration = new DefaultConfiguration().set(dataSource).set(SQLDialect.POSTGRES)
                List<School> schools = new SchoolDao(configuration).findAll()
                render json(schools)
            }

            get('students') {
                response.headers.add('Access-Control-Allow-Origin', '*')
                DataSource dataSource = registry.get(DataSource.class)
                Configuration configuration = new DefaultConfiguration().set(dataSource).set(SQLDialect.POSTGRES)
                List<Student> students = new StudentDao(configuration).findAll()
                render json(students)
            }
        }

        prefix('test/data') {
            get('jobs') {
                DataSource dataSource = registry.get(DataSource.class)
                DSLContext create = DSL.using(dataSource, SQLDialect.POSTGRES);

                HttpClient httpClient = registry.get(HttpClient.class)

                URI uri = new URI('http://api.indeed.com/ads/apisearch' +
                        '?publisher=6453215428478291' +
                        '&v=2' +
                        '&format=json' +
                        '&limit=25' +
                        '&q=software' +
                        '&l=Waterloo' +
                        '&co=ca'
                )

                httpClient.get(uri).then {
                    def root = new JsonSlurper().parseText(it.body.text)

                    // get total results
                    int totalResults = root.totalResults
                    log.info(totalResults.toString())

                    1.step(totalResults, 25) {
                        httpClient.get(uri).then { response ->
                            root = new JsonSlurper().parseText(response.body.text)
                            root.results.each {
                                if (!it.expired) {
                                    SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss z");
//                                    log.info("Inserting: ${it.jobtitle.toString()} @ ${it.company.toString()}")
//                                    create.insertInto(JOB_POSTING)
//                                            .set(JOB_POSTING.TITLE, it.jobtitle.toString())
//                                            .set(JOB_POSTING.EMPLOYERNAME, it.company.toString())
//                                            .set(JOB_POSTING.DESCRIPTION_9, it.snippet.toString())
//                                            .set(JOB_POSTING.DATEPOSTED_9, new java.sql.Date(formatter.parse(it.date.toString()).getTime()))
//                                            .set(JOB_POSTING.LOCATION, it.formattedLocation.toString())
//                                            .execute()
                                }
                            }
                        }
                    }
                    render totalResults.toString()
                }
            }

            prefix('schools') {
                get('unis/canada') {
                    def htmlFile = new File('src/ratpack/data/schools_canada_universities_wikipedia.html')
                    def html = new XmlSlurper().parse(htmlFile)

                    html.tbody.children().each { tr ->
                        tr.collect {

                            def name = it.td[0].depthFirst().findAll { it.name() == 'a' }[0].@title.toString()
                            def schoolType = 'University'
                            def city = it.td[1].toString().replaceAll("[\\t\\n\\r]"," ").replaceAll("\\s+", " ")
                            def provinceOrState = it.td[2].toString()
                            def country = 'Canada'
                            def established = it.td[4].toString()
                            def totalStudents = (int) NumberFormat.getIntegerInstance(Locale.US).parse(it.td[7].localText()[0].toString())
                            def wikiLink = 'https://en.wikipedia.org/wiki/List_of_universities_in_Canada' + it.td[0].depthFirst().findAll { it.name() == 'a' }[0].@href.toString()
                            def logoSrc = null

//                            log.info("Inserting: $name @ $city , $provinceOrState, $country")
//                            DataSource dataSource = registry.get(DataSource.class)
//                            DSLContext create = DSL.using(dataSource, SQLDialect.POSTGRES);
//                            create.insertInto(SCHOOL)
//                                    .set(SCHOOL.NAME, name)
//                                    .set(SCHOOL.SCHOOLTYPE, schoolType)
//                                    .set(SCHOOL.CITY, city)
//                                    .set(SCHOOL.PROVINCEORSTATE, provinceOrState)
//                                    .set(SCHOOL.COUNTRY, country)
//                                    .set(SCHOOL.ESTABLISHED, established)
//                                    .set(SCHOOL.TOTALSTUDENTS, totalStudents)
//                                    .set(SCHOOL.WIKILINK, wikiLink)
//                                    .set(SCHOOL.LOGOSRC, 'images/icon_default_company.png')
//                                    .execute()
                        }
                    }
                    render htmlFile.text
                }
            }

            get('students') {
                def studentFile = new File('src/ratpack/data/students_generated_200.txt')

                def students = []

                studentFile.text.eachLine { line ->

                    if(!line.startsWith('name'))
                    {
                        def studentData = line.tokenize('|')

                        def name = studentData[0]
                        def phoneNumber = studentData[1]
                        def email = studentData[2]
                        def dateJoined = studentData[3]
                        def streetAddress = studentData[4]
                        def city = studentData[5]
                        def region = studentData[6]
                        def country = studentData[7]
                        def postalOrZip = studentData[8]
                        def description = studentData[9]
                        def age = studentData[10]

//                        log.info("Inserting: $name")
//                        DataSource dataSource = registry.get(DataSource.class)
//                        DSLContext create = DSL.using(dataSource, SQLDialect.POSTGRES);
//                        create.insertInto(STUDENT)
//                                .set(STUDENT.NAME, name)
//                                .set(STUDENT.PHONENUMBER, phoneNumber)
//                                 // TODO: date joined
//                                .set(STUDENT.DATEJOINED, new Date(Calendar.getInstance().getTimeInMillis()))
//                                .set(STUDENT.EMAIL, email)
//                                .set(STUDENT.STREETADDRESS, streetAddress)
//                                .set(STUDENT.CITY, city)
//                                .set(STUDENT.REGION, region)
//                                .set(STUDENT.COUNTRY, country)
//                                .set(STUDENT.POSTALORZIP, postalOrZip)
//                                .set(STUDENT.DESCRIPTION, description)
//                                .set(STUDENT.AGE, Integer.parseInt(age))
//                                .execute()
                    }
                }

                render students.toString()
            }

            prefix('companies') {
                get('canada') {
                    def wikiLinks = new File('src/ratpack/data/companies_canada_wiki_links.txt')

                    DataSource dataSource = registry.get(DataSource.class)
                    DSLContext create = DSL.using(dataSource, SQLDialect.POSTGRES);

                    HttpClient httpClient = registry.get(HttpClient.class)

                    URI uri = new URI('https://en.wikipedia.org/wiki/1-800-GOT-JUNK%3F')

                    httpClient.get(uri).then {
                        it.body.text.eachLine { line ->
                            if(line.contains('class="infobox vcard"'))
                            {
//                                log.info(line)
                            }
                            if(line.contains('class="logo"'))
                            {
                                new XmlSlurper().parseText(line).'**'.findAll {
                                    log.info(it.toString())
                                }
//                                log.info(line)
                            }
                        }
                        render it.body.text
                    }

//                    def slurper = new XmlSlurper()
//                    slurper.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false)
//                    slurper.setFeature("http://apache.org/xml/features/disallow-doctype-decl", false)
//                    def html = slurper.parse('https://en.wikipedia.org/wiki/1-800-GOT-JUNK%3F')
//
//                    def result = html.'**'.findAll{ it.@class.toString() == 'infobox vcard'
////                        it.@class == 'infobox'}.each {
//                        log.info(it.toString())
//                        render it.toString()
//                    }

//                    log.info(root.toListString())

//                    render html.text()
//                    render result.toListString()

//                    wikiLinks.eachLine { wikiLink ->
//                        wikiLink = wikiLink.replaceAll("<li><a href=\"", '').split("\"")[0]
//                        log.info(wikiLink)
//
//                        def slurper = new XmlSlurper()
//                        slurper.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false)
//                        slurper.setFeature("http://apache.org/xml/features/disallow-doctype-decl", false)
//                        def html = slurper.parse('https://en.wikipedia.org/' + wikiLink.toString())
//
//                        html.'**'.findAll{ it.@class == 'infobox'}.each {
//                            log.info(it.toString())
//                        }
//
////                        httpClient.get(uri).then {
////                            def root = new XmlSlurper().parseText(it.body.text)
////                        }
//                    }

//                    render html.text()
                }
            }
        }

        prefix('test') {
            get('jobs/insert') {
                DataSource dataSource = registry.get(DataSource.class)
                DSLContext create = DSL.using(dataSource, SQLDialect.POSTGRES);
                create.insertInto(JOB_POSTING)
                        .set(JOB_POSTING.TITLE, 'Software Developer II')
                        .set(JOB_POSTING.EMPLOYERNAME, 'BlackBerry')
                        .set(JOB_POSTING.DESCRIPTION_9, 'Description')
                        .set(JOB_POSTING.DATEPOSTED_9, new Date(123))
                        .set(JOB_POSTING.LOCATION, 'Waterloo')
                        .execute()
                render "inserted!"
            }

            get('schools/insert') {
                DataSource dataSource = registry.get(DataSource.class)
                DSLContext create = DSL.using(dataSource, SQLDialect.POSTGRES);
                create.insertInto(SCHOOL)
                        .set(SCHOOL.NAME, 'University of Waterloo')
                        .set(SCHOOL.SCHOOLTYPE, 'University')
                        .set(SCHOOL.CITY, 'Waterloo')
                        .set(SCHOOL.PROVINCEORSTATE, 'Ontario')
                        .set(SCHOOL.COUNTRY, 'Canada')
                        .set(SCHOOL.ESTABLISHED, '1999')
                        .set(SCHOOL.TOTALSTUDENTS, 1)
                        .set(SCHOOL.WIKILINK, 'wiki/UniversityOfWaterloo')
                        .set(SCHOOL.LOGOSRC, 'dist/images/icon_default_company.578524b6.png')
                        .execute()
                render "inserted!"
            }

            get('students/insert') {
//                DataSource dataSource = registry.get(DataSource.class)
//                DSLContext create = DSL.using(dataSource, SQLDialect.POSTGRES);
//                create.insertInto(STUDENT)
//                    .set(STUDENT.NAME, 'Vinod Sajja')
//                    .set(STUDENT.PHONENUMBER, '(519) 502-7991')
//                    .set(STUDENT.DATEJOINED, new Date(Calendar.getInstance().getTimeInMillis()))
//                    .set(STUDENT.EMAIL, 'vsajja@engmail.uwaterloo.ca')
//                    .set(STUDENT.STREETADDRESS, '123 Fake Street, Unit 35')
//                    .set(STUDENT.CITY, 'Waterloo')
//                    .set(STUDENT.REGION, 'Ontario')
//                    .set(STUDENT.COUNTRY, 'Canada')
//                    .set(STUDENT.POSTALORZIP, 'T9H5R7')
//                    .set(STUDENT.DESCRIPTION, 'description')
//                    .set(STUDENT.AGE, Integer.parseInt('29'))
//                    .execute()

                render "inserted!"
            }
        }

        files {
            dir 'dist'
        }
    }
}