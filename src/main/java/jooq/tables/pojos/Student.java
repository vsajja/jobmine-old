/**
 * This class is generated by jOOQ
 */
package jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;


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
public class Student implements Serializable {

	private static final long serialVersionUID = 1814070278;

	private final String  name;
	private final String  phonenumber;
	private final String  email;
	private final Date    datejoined;
	private final String  streetaddress;
	private final String  city;
	private final String  region;
	private final String  country;
	private final String  postalorzip;
	private final String  description;
	private final Integer age;
	private final Integer studentId;

	public Student(Student value) {
		this.name = value.name;
		this.phonenumber = value.phonenumber;
		this.email = value.email;
		this.datejoined = value.datejoined;
		this.streetaddress = value.streetaddress;
		this.city = value.city;
		this.region = value.region;
		this.country = value.country;
		this.postalorzip = value.postalorzip;
		this.description = value.description;
		this.age = value.age;
		this.studentId = value.studentId;
	}

	public Student(
		String  name,
		String  phonenumber,
		String  email,
		Date    datejoined,
		String  streetaddress,
		String  city,
		String  region,
		String  country,
		String  postalorzip,
		String  description,
		Integer age,
		Integer studentId
	) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.datejoined = datejoined;
		this.streetaddress = streetaddress;
		this.city = city;
		this.region = region;
		this.country = country;
		this.postalorzip = postalorzip;
		this.description = description;
		this.age = age;
		this.studentId = studentId;
	}

	public String getName() {
		return this.name;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public String getEmail() {
		return this.email;
	}

	public Date getDatejoined() {
		return this.datejoined;
	}

	public String getStreetaddress() {
		return this.streetaddress;
	}

	public String getCity() {
		return this.city;
	}

	public String getRegion() {
		return this.region;
	}

	public String getCountry() {
		return this.country;
	}

	public String getPostalorzip() {
		return this.postalorzip;
	}

	public String getDescription() {
		return this.description;
	}

	public Integer getAge() {
		return this.age;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Student (");

		sb.append(name);
		sb.append(", ").append(phonenumber);
		sb.append(", ").append(email);
		sb.append(", ").append(datejoined);
		sb.append(", ").append(streetaddress);
		sb.append(", ").append(city);
		sb.append(", ").append(region);
		sb.append(", ").append(country);
		sb.append(", ").append(postalorzip);
		sb.append(", ").append(description);
		sb.append(", ").append(age);
		sb.append(", ").append(studentId);

		sb.append(")");
		return sb.toString();
	}
}
