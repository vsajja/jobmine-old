/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.JobAppRecord;

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
public class JobApp extends TableImpl<JobAppRecord> {

	private static final long serialVersionUID = -1469674432;

	/**
	 * The reference instance of <code>public.job_app</code>
	 */
	public static final JobApp JOB_APP = new JobApp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JobAppRecord> getRecordType() {
		return JobAppRecord.class;
	}

	/**
	 * The column <code>public.job_app.job_app_id</code>.
	 */
	public final TableField<JobAppRecord, Integer> JOB_APP_ID = createField("job_app_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.job_app.user_id</code>.
	 */
	public final TableField<JobAppRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.job_app.job_id</code>.
	 */
	public final TableField<JobAppRecord, Integer> JOB_ID = createField("job_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.job_app</code> table reference
	 */
	public JobApp() {
		this("job_app", null);
	}

	/**
	 * Create an aliased <code>public.job_app</code> table reference
	 */
	public JobApp(String alias) {
		this(alias, JOB_APP);
	}

	private JobApp(String alias, Table<JobAppRecord> aliased) {
		this(alias, aliased, null);
	}

	private JobApp(String alias, Table<JobAppRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JobAppRecord, Integer> getIdentity() {
		return Keys.IDENTITY_JOB_APP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JobAppRecord> getPrimaryKey() {
		return Keys.JOB_APP_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JobAppRecord>> getKeys() {
		return Arrays.<UniqueKey<JobAppRecord>>asList(Keys.JOB_APP_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JobAppRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JobAppRecord, ?>>asList(Keys.JOB_APP__JOB_APP_USER_USER_ID_FK, Keys.JOB_APP__JOB_APP_JOB_JOB_ID_FK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApp as(String alias) {
		return new JobApp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public JobApp rename(String name) {
		return new JobApp(name, null);
	}
}
