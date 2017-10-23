/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables.records;


import javax.annotation.Generated;

import jooq.generated.tables.JobShortlist;

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
public class JobShortlistRecord extends UpdatableRecordImpl<JobShortlistRecord> implements Record3<Integer, Integer, Integer> {

	private static final long serialVersionUID = -639735434;

	/**
	 * Setter for <code>public.job_shortlist.job_shortlist_id</code>.
	 */
	public JobShortlistRecord setJobShortlistId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.job_shortlist.job_shortlist_id</code>.
	 */
	public Integer getJobShortlistId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.job_shortlist.job_id</code>.
	 */
	public JobShortlistRecord setJobId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.job_shortlist.job_id</code>.
	 */
	public Integer getJobId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.job_shortlist.student_id</code>.
	 */
	public JobShortlistRecord setStudentId(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.job_shortlist.student_id</code>.
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
	public Row3<Integer, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return JobShortlist.JOB_SHORTLIST.JOB_SHORTLIST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return JobShortlist.JOB_SHORTLIST.JOB_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return JobShortlist.JOB_SHORTLIST.STUDENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getJobShortlistId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getJobId();
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
	public JobShortlistRecord value1(Integer value) {
		setJobShortlistId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobShortlistRecord value2(Integer value) {
		setJobId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobShortlistRecord value3(Integer value) {
		setStudentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobShortlistRecord values(Integer value1, Integer value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JobShortlistRecord
	 */
	public JobShortlistRecord() {
		super(JobShortlist.JOB_SHORTLIST);
	}

	/**
	 * Create a detached, initialised JobShortlistRecord
	 */
	public JobShortlistRecord(Integer jobShortlistId, Integer jobId, Integer studentId) {
		super(JobShortlist.JOB_SHORTLIST);

		setValue(0, jobShortlistId);
		setValue(1, jobId);
		setValue(2, studentId);
	}
}
