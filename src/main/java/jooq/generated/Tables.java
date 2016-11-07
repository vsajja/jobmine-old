/**
 * This class is generated by jOOQ
 */
package jooq.generated;


import javax.annotation.Generated;

import jooq.generated.tables.Company;
import jooq.generated.tables.Document;
import jooq.generated.tables.Image;
import jooq.generated.tables.Job;
import jooq.generated.tables.JobApp;
import jooq.generated.tables.JobAppPackage;
import jooq.generated.tables.JobInterview;
import jooq.generated.tables.JobMine;
import jooq.generated.tables.JobOffer;
import jooq.generated.tables.Location;
import jooq.generated.tables.School;
import jooq.generated.tables.Student;


/**
 * Convenience access to all tables in public
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table public.company
	 */
	public static final Company COMPANY = jooq.generated.tables.Company.COMPANY;

	/**
	 * The table public.document
	 */
	public static final Document DOCUMENT = jooq.generated.tables.Document.DOCUMENT;

	/**
	 * The table public.image
	 */
	public static final Image IMAGE = jooq.generated.tables.Image.IMAGE;

	/**
	 * The table public.job
	 */
	public static final Job JOB = jooq.generated.tables.Job.JOB;

	/**
	 * The table public.job_app
	 */
	public static final JobApp JOB_APP = jooq.generated.tables.JobApp.JOB_APP;

	/**
	 * The table public.job_app_package
	 */
	public static final JobAppPackage JOB_APP_PACKAGE = jooq.generated.tables.JobAppPackage.JOB_APP_PACKAGE;

	/**
	 * The table public.job_interview
	 */
	public static final JobInterview JOB_INTERVIEW = jooq.generated.tables.JobInterview.JOB_INTERVIEW;

	/**
	 * The table public.job_mine
	 */
	public static final JobMine JOB_MINE = jooq.generated.tables.JobMine.JOB_MINE;

	/**
	 * The table public.job_offer
	 */
	public static final JobOffer JOB_OFFER = jooq.generated.tables.JobOffer.JOB_OFFER;

	/**
	 * The table public.location
	 */
	public static final Location LOCATION = jooq.generated.tables.Location.LOCATION;

	/**
	 * The table public.school
	 */
	public static final School SCHOOL = jooq.generated.tables.School.SCHOOL;

	/**
	 * The table public.student
	 */
	public static final Student STUDENT = jooq.generated.tables.Student.STUDENT;
}