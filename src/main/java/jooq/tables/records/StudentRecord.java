/**
 * This class is generated by jOOQ
 */
package jooq.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import jooq.tables.Student;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class StudentRecord extends UpdatableRecordImpl<StudentRecord> implements Record12<String, String, String, Date, String, String, String, String, String, String, Integer, Integer> {

	private static final long serialVersionUID = -1597044118;

	/**
	 * Setter for <code>public.student.name</code>.
	 */
	public StudentRecord setName(String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.name</code>.
	 */
	public String getName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.student.phonenumber</code>.
	 */
	public StudentRecord setPhonenumber(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.phonenumber</code>.
	 */
	public String getPhonenumber() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.student.email</code>.
	 */
	public StudentRecord setEmail(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.email</code>.
	 */
	public String getEmail() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.student.datejoined</code>.
	 */
	public StudentRecord setDatejoined(Date value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.datejoined</code>.
	 */
	public Date getDatejoined() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>public.student.streetaddress</code>.
	 */
	public StudentRecord setStreetaddress(String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.streetaddress</code>.
	 */
	public String getStreetaddress() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.student.city</code>.
	 */
	public StudentRecord setCity(String value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.city</code>.
	 */
	public String getCity() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>public.student.region</code>.
	 */
	public StudentRecord setRegion(String value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.region</code>.
	 */
	public String getRegion() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>public.student.country</code>.
	 */
	public StudentRecord setCountry(String value) {
		setValue(7, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.country</code>.
	 */
	public String getCountry() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>public.student.postalorzip</code>.
	 */
	public StudentRecord setPostalorzip(String value) {
		setValue(8, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.postalorzip</code>.
	 */
	public String getPostalorzip() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>public.student.description</code>.
	 */
	public StudentRecord setDescription(String value) {
		setValue(9, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>public.student.age</code>.
	 */
	public StudentRecord setAge(Integer value) {
		setValue(10, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.age</code>.
	 */
	public Integer getAge() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>public.student.student_id</code>.
	 */
	public StudentRecord setStudentId(Integer value) {
		setValue(11, value);
		return this;
	}

	/**
	 * Getter for <code>public.student.student_id</code>.
	 */
	public Integer getStudentId() {
		return (Integer) getValue(11);
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
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, String, String, Date, String, String, String, String, String, String, Integer, Integer> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, String, String, Date, String, String, String, String, String, String, Integer, Integer> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Student.STUDENT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Student.STUDENT.PHONENUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Student.STUDENT.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return Student.STUDENT.DATEJOINED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Student.STUDENT.STREETADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Student.STUDENT.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Student.STUDENT.REGION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Student.STUDENT.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Student.STUDENT.POSTALORZIP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return Student.STUDENT.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return Student.STUDENT.AGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return Student.STUDENT.STUDENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getPhonenumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getDatejoined();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getStreetaddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getRegion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getPostalorzip();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getAge();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getStudentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value1(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value2(String value) {
		setPhonenumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value3(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value4(Date value) {
		setDatejoined(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value5(String value) {
		setStreetaddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value6(String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value7(String value) {
		setRegion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value8(String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value9(String value) {
		setPostalorzip(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value10(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value11(Integer value) {
		setAge(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord value12(Integer value) {
		setStudentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StudentRecord values(String value1, String value2, String value3, Date value4, String value5, String value6, String value7, String value8, String value9, String value10, Integer value11, Integer value12) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StudentRecord
	 */
	public StudentRecord() {
		super(Student.STUDENT);
	}

	/**
	 * Create a detached, initialised StudentRecord
	 */
	public StudentRecord(String name, String phonenumber, String email, Date datejoined, String streetaddress, String city, String region, String country, String postalorzip, String description, Integer age, Integer studentId) {
		super(Student.STUDENT);

		setValue(0, name);
		setValue(1, phonenumber);
		setValue(2, email);
		setValue(3, datejoined);
		setValue(4, streetaddress);
		setValue(5, city);
		setValue(6, region);
		setValue(7, country);
		setValue(8, postalorzip);
		setValue(9, description);
		setValue(10, age);
		setValue(11, studentId);
	}
}
