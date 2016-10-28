/**
 * This class is generated by jOOQ
 */
package jooq.tables.records;


import javax.annotation.Generated;

import jooq.tables.School;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class SchoolRecord extends UpdatableRecordImpl<SchoolRecord> implements Record10<Integer, String, String, String, String, String, Integer, String, String, String> {

	private static final long serialVersionUID = 982320745;

	/**
	 * Setter for <code>public.school.schoold</code>.
	 */
	public SchoolRecord setSchoold(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.schoold</code>.
	 */
	public Integer getSchoold() {
		return (Integer) getValue(0);
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
	 * Setter for <code>public.school.schooltype</code>.
	 */
	public SchoolRecord setSchooltype(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.schooltype</code>.
	 */
	public String getSchooltype() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.school.city</code>.
	 */
	public SchoolRecord setCity(String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.city</code>.
	 */
	public String getCity() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.school.provinceorstate</code>.
	 */
	public SchoolRecord setProvinceorstate(String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.provinceorstate</code>.
	 */
	public String getProvinceorstate() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.school.established</code>.
	 */
	public SchoolRecord setEstablished(String value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.established</code>.
	 */
	public String getEstablished() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>public.school.totalstudents</code>.
	 */
	public SchoolRecord setTotalstudents(Integer value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.totalstudents</code>.
	 */
	public Integer getTotalstudents() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>public.school.wikilink</code>.
	 */
	public SchoolRecord setWikilink(String value) {
		setValue(7, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.wikilink</code>.
	 */
	public String getWikilink() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>public.school.logosrc</code>.
	 */
	public SchoolRecord setLogosrc(String value) {
		setValue(8, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.logosrc</code>.
	 */
	public String getLogosrc() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>public.school.country</code>.
	 */
	public SchoolRecord setCountry(String value) {
		setValue(9, value);
		return this;
	}

	/**
	 * Getter for <code>public.school.country</code>.
	 */
	public String getCountry() {
		return (String) getValue(9);
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
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Integer, String, String, String, String, String, Integer, String, String, String> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Integer, String, String, String, String, String, Integer, String, String, String> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return School.SCHOOL.SCHOOLD;
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
		return School.SCHOOL.SCHOOLTYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return School.SCHOOL.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return School.SCHOOL.PROVINCEORSTATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return School.SCHOOL.ESTABLISHED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return School.SCHOOL.TOTALSTUDENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return School.SCHOOL.WIKILINK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return School.SCHOOL.LOGOSRC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return School.SCHOOL.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getSchoold();
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
		return getSchooltype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getProvinceorstate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getEstablished();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getTotalstudents();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getWikilink();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getLogosrc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value1(Integer value) {
		setSchoold(value);
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
		setSchooltype(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value4(String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value5(String value) {
		setProvinceorstate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value6(String value) {
		setEstablished(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value7(Integer value) {
		setTotalstudents(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value8(String value) {
		setWikilink(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value9(String value) {
		setLogosrc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord value10(String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchoolRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, String value8, String value9, String value10) {
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
	public SchoolRecord(Integer schoold, String name, String schooltype, String city, String provinceorstate, String established, Integer totalstudents, String wikilink, String logosrc, String country) {
		super(School.SCHOOL);

		setValue(0, schoold);
		setValue(1, name);
		setValue(2, schooltype);
		setValue(3, city);
		setValue(4, provinceorstate);
		setValue(5, established);
		setValue(6, totalstudents);
		setValue(7, wikilink);
		setValue(8, logosrc);
		setValue(9, country);
	}
}
