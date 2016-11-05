/**
 * This class is generated by jOOQ
 */
package jooq.tables.records;


import javax.annotation.Generated;

import jooq.tables.JobAppPackage;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JobAppPackageRecord extends UpdatableRecordImpl<JobAppPackageRecord> implements Record3<Integer, String, Integer> {

	private static final long serialVersionUID = -1592556214;

	/**
	 * Setter for <code>public.job_app_package.job_app_package_id</code>.
	 */
	public JobAppPackageRecord setJobAppPackageId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.job_app_package.job_app_package_id</code>.
	 */
	public Integer getJobAppPackageId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.job_app_package.name</code>.
	 */
	public JobAppPackageRecord setName(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.job_app_package.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.job_app_package.student_id</code>.
	 */
	public JobAppPackageRecord setStudentId(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.job_app_package.student_id</code>.
	 */
	public Integer getStudentId() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return JobAppPackage.JOB_APP_PACKAGE.JOB_APP_PACKAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JobAppPackage.JOB_APP_PACKAGE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return JobAppPackage.JOB_APP_PACKAGE.STUDENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getJobAppPackageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getStudentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobAppPackageRecord value1(Integer value) {
		setJobAppPackageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobAppPackageRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobAppPackageRecord value3(Integer value) {
		setStudentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobAppPackageRecord values(Integer value1, String value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JobAppPackageRecord
	 */
	public JobAppPackageRecord() {
		super(JobAppPackage.JOB_APP_PACKAGE);
	}

	/**
	 * Create a detached, initialised JobAppPackageRecord
	 */
	public JobAppPackageRecord(Integer jobAppPackageId, String name, Integer studentId) {
		super(JobAppPackage.JOB_APP_PACKAGE);

		setValue(0, jobAppPackageId);
		setValue(1, name);
		setValue(2, studentId);
	}
}
