/**
 * This class is generated by jOOQ
 */
package jooq.tables.daos;


import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import jooq.tables.Job;
import jooq.tables.records.JobRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobDao extends DAOImpl<JobRecord, jooq.tables.pojos.Job, Integer> {

	/**
	 * Create a new JobDao without any configuration
	 */
	public JobDao() {
		super(Job.JOB, jooq.tables.pojos.Job.class);
	}

	/**
	 * Create a new JobDao with an attached configuration
	 */
	public JobDao(Configuration configuration) {
		super(Job.JOB, jooq.tables.pojos.Job.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(jooq.tables.pojos.Job object) {
		return object.getJobId();
	}

	/**
	 * Fetch records that have <code>job_id IN (values)</code>
	 */
	public List<jooq.tables.pojos.Job> fetchByJobId(Integer... values) {
		return fetch(Job.JOB.JOB_ID, values);
	}

	/**
	 * Fetch a unique record that has <code>job_id = value</code>
	 */
	public jooq.tables.pojos.Job fetchOneByJobId(Integer value) {
		return fetchOne(Job.JOB.JOB_ID, value);
	}

	/**
	 * Fetch records that have <code>title IN (values)</code>
	 */
	public List<jooq.tables.pojos.Job> fetchByTitle(String... values) {
		return fetch(Job.JOB.TITLE, values);
	}

	/**
	 * Fetch records that have <code>description	 IN (values)</code>
	 */
	public List<jooq.tables.pojos.Job> fetchByDescription_9(String... values) {
		return fetch(Job.JOB.DESCRIPTION_9, values);
	}

	/**
	 * Fetch records that have <code>location IN (values)</code>
	 */
	public List<jooq.tables.pojos.Job> fetchByLocation(String... values) {
		return fetch(Job.JOB.LOCATION, values);
	}

	/**
	 * Fetch records that have <code>datePosted	 IN (values)</code>
	 */
	public List<jooq.tables.pojos.Job> fetchByDateposted_9(Date... values) {
		return fetch(Job.JOB.DATEPOSTED_9, values);
	}

	/**
	 * Fetch records that have <code>employername IN (values)</code>
	 */
	public List<jooq.tables.pojos.Job> fetchByEmployername(String... values) {
		return fetch(Job.JOB.EMPLOYERNAME, values);
	}

	/**
	 * Fetch records that have <code>employerlogo IN (values)</code>
	 */
	public List<jooq.tables.pojos.Job> fetchByEmployerlogo(byte[]... values) {
		return fetch(Job.JOB.EMPLOYERLOGO, values);
	}
}
