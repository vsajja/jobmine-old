/**
 * This class is generated by jOOQ
 */
package jooq.generated;


import javax.annotation.Generated;

import jooq.generated.tables.Company;
import jooq.generated.tables.Job;
import jooq.generated.tables.JobApp;
import jooq.generated.tables.JobShortlist;
import jooq.generated.tables.Location;
import jooq.generated.tables.Mine;
import jooq.generated.tables.User;


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
	 * The table public.job
	 */
	public static final Job JOB = jooq.generated.tables.Job.JOB;

	/**
	 * The table public.job_app
	 */
	public static final JobApp JOB_APP = jooq.generated.tables.JobApp.JOB_APP;

	/**
	 * The table public.job_shortlist
	 */
	public static final JobShortlist JOB_SHORTLIST = jooq.generated.tables.JobShortlist.JOB_SHORTLIST;

	/**
	 * The table public.location
	 */
	public static final Location LOCATION = jooq.generated.tables.Location.LOCATION;

	/**
	 * The table public.mine
	 */
	public static final Mine MINE = jooq.generated.tables.Mine.MINE;

	/**
	 * The table public.user
	 */
	public static final User USER = jooq.generated.tables.User.USER;
}
