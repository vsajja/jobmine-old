/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.JobShortlistRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class JobShortlist extends TableImpl<JobShortlistRecord> {

	private static final long serialVersionUID = 1592490681;

	/**
	 * The reference instance of <code>public.job_shortlist</code>
	 */
	public static final JobShortlist JOB_SHORTLIST = new JobShortlist();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JobShortlistRecord> getRecordType() {
		return JobShortlistRecord.class;
	}

	/**
	 * The column <code>public.job_shortlist.job_shortlist_id</code>.
	 */
	public final TableField<JobShortlistRecord, Integer> JOB_SHORTLIST_ID = createField("job_shortlist_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.job_shortlist.job_id</code>.
	 */
	public final TableField<JobShortlistRecord, Integer> JOB_ID = createField("job_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.job_shortlist.student_id</code>.
	 */
	public final TableField<JobShortlistRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.job_shortlist</code> table reference
	 */
	public JobShortlist() {
		this("job_shortlist", null);
	}

	/**
	 * Create an aliased <code>public.job_shortlist</code> table reference
	 */
	public JobShortlist(String alias) {
		this(alias, JOB_SHORTLIST);
	}

	private JobShortlist(String alias, Table<JobShortlistRecord> aliased) {
		this(alias, aliased, null);
	}

	private JobShortlist(String alias, Table<JobShortlistRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JobShortlistRecord, Integer> getIdentity() {
		return Keys.IDENTITY_JOB_SHORTLIST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JobShortlistRecord> getPrimaryKey() {
		return Keys.JOB_SHORTLIST_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JobShortlistRecord>> getKeys() {
		return Arrays.<UniqueKey<JobShortlistRecord>>asList(Keys.JOB_SHORTLIST_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JobShortlistRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JobShortlistRecord, ?>>asList(Keys.JOB_SHORTLIST__JOB_SHORTLIST_JOB_JOB_ID_FK, Keys.JOB_SHORTLIST__JOB_SHORTLIST_STUDENT_STUDENT_ID_FK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobShortlist as(String alias) {
		return new JobShortlist(alias, this);
	}

	/**
	 * Rename this table
	 */
	public JobShortlist rename(String name) {
		return new JobShortlist(name, null);
	}
}