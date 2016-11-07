/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import jooq.generated.tables.School;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class SchoolRecord extends UpdatableRecordImpl<SchoolRecord> implements Record9<Long, String, String, Integer, Date, String, Integer, Integer, Integer> {

	private static final long serialVersionUID = -1438028959;

	/**
	 * Setter for <code>public.school.school_id</code>.
	 */
	public SchoolRecord setSchoolId(Long value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.school_id</code>.
	 */
	public Long getSchoolId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>public.school.name</code>.
	 */
	public SchoolRecord setName(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.school.type</code>.
	 */
	public SchoolRecord setType(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.type</code>.
	 */
	public String getType() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.school.total_students</code>.
	 */
	public SchoolRecord setTotalStudents(Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.total_students</code>.
	 */
	public Integer getTotalStudents() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.school.established_date</code>.
	 */
	public SchoolRecord setEstablishedDate(Date value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.established_date</code>.
	 */
	public Date getEstablishedDate() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>public.school.description</code>.
	 */
	public SchoolRecord setDescription(String value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>public.school.location_id</code>.
	 */
	public SchoolRecord setLocationId(Integer value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.location_id</code>.
	 */
	public Integer getLocationId() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>public.school.image_id</code>.
	 */
	public SchoolRecord setImageId(Integer value) {
		setValue(7, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.image_id</code>.
	 */
	public Integer getImageId() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>public.school.job_mine_id</code>.
	 */
	public SchoolRecord setJobMineId(Integer value) {
		setValue(8, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.job_mine_id</code>.
	 */
	public Integer getJobMineId() {
		return (Integer) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Long, String, String, Integer, Date, String, Integer, Integer, Integer> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Long, String, String, Integer, Date, String, Integer, Integer, Integer> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return School.SCHOOL.SCHOOL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return School.SCHOOL.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return School.SCHOOL.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return School.SCHOOL.TOTAL_STUDENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return School.SCHOOL.ESTABLISHED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return School.SCHOOL.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return School.SCHOOL.LOCATION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return School.SCHOOL.IMAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return School.SCHOOL.JOB_MINE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getSchoolId();
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
	public String value3() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getTotalStudents();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value5() {
		return getEstablishedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getLocationId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getImageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getJobMineId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value1(Long value) {
		setSchoolId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value3(String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value4(Integer value) {
		setTotalStudents(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value5(Date value) {
		setEstablishedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value6(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value7(Integer value) {
		setLocationId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value8(Integer value) {
		setImageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value9(Integer value) {
		setJobMineId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord values(Long value1, String value2, String value3, Integer value4, Date value5, String value6, Integer value7, Integer value8, Integer value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SchoolRecord
	 */
	public SchoolRecord() {
		super(School.SCHOOL);
	}

	/**
	 * Create a detached, initialised SchoolRecord
	 */
	public SchoolRecord(Long schoolId, String name, String type, Integer totalStudents, Date establishedDate, String description, Integer locationId, Integer imageId, Integer jobMineId) {
		super(School.SCHOOL);

		setValue(0, schoolId);
		setValue(1, name);
		setValue(2, type);
		setValue(3, totalStudents);
		setValue(4, establishedDate);
		setValue(5, description);
		setValue(6, locationId);
		setValue(7, imageId);
		setValue(8, jobMineId);
	}
}