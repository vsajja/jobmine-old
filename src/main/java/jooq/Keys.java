/**
 * This class is generated by jOOQ
 */
package jooq;


import javax.annotation.Generated;

import jooq.tables.JobPosting;
import jooq.tables.School;
import jooq.tables.records.JobPostingRecord;
import jooq.tables.records.SchoolRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<JobPostingRecord, Integer> IDENTITY_JOB_POSTING = Identities0.IDENTITY_JOB_POSTING;
	public static final Identity<SchoolRecord, Integer> IDENTITY_SCHOOL = Identities0.IDENTITY_SCHOOL;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<JobPostingRecord> JOB_POSTING_PKEY = UniqueKeys0.JOB_POSTING_PKEY;
	public static final UniqueKey<SchoolRecord> SCHOOL_SCHOOLD_PK = UniqueKeys0.SCHOOL_SCHOOLD_PK;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<JobPostingRecord, Integer> IDENTITY_JOB_POSTING = createIdentity(JobPosting.JOB_POSTING, JobPosting.JOB_POSTING.JOBPOSTINGID);
		public static Identity<SchoolRecord, Integer> IDENTITY_SCHOOL = createIdentity(School.SCHOOL, School.SCHOOL.SCHOOLD);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<JobPostingRecord> JOB_POSTING_PKEY = createUniqueKey(JobPosting.JOB_POSTING, JobPosting.JOB_POSTING.JOBPOSTINGID);
		public static final UniqueKey<SchoolRecord> SCHOOL_SCHOOLD_PK = createUniqueKey(School.SCHOOL, School.SCHOOL.SCHOOLD);
	}
}
