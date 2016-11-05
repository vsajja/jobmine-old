/**
 * This class is generated by jOOQ
 */
package jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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

	private static final long serialVersionUID = -318983637;

	private final Integer   studentId;
	private final String    firstName;
	private final String    lastName;
	private final String    username;
	private final String    emailAddress;
	private final Timestamp lastLoggedinTimestamp;
	private final String    employmentStatus;
	private final Timestamp joinedTimestamp;
	private final Integer   karma;
	private final Integer   totalViews;
	private final Integer   age;
	private final String    gender;
	private final String    salary;
	private final String    relationshipStatus;
	private final String    dreams;
	private final String    phoneNumber;
	private final String    employmentHistory;
	private final String    skills;
	private final Integer   schoolId;
	private final Integer   locationId;
	private final Integer   imageId;

	public Student(Student value) {
		this.studentId = value.studentId;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.username = value.username;
		this.emailAddress = value.emailAddress;
		this.lastLoggedinTimestamp = value.lastLoggedinTimestamp;
		this.employmentStatus = value.employmentStatus;
		this.joinedTimestamp = value.joinedTimestamp;
		this.karma = value.karma;
		this.totalViews = value.totalViews;
		this.age = value.age;
		this.gender = value.gender;
		this.salary = value.salary;
		this.relationshipStatus = value.relationshipStatus;
		this.dreams = value.dreams;
		this.phoneNumber = value.phoneNumber;
		this.employmentHistory = value.employmentHistory;
		this.skills = value.skills;
		this.schoolId = value.schoolId;
		this.locationId = value.locationId;
		this.imageId = value.imageId;
	}

	public Student(
		Integer   studentId,
		String    firstName,
		String    lastName,
		String    username,
		String    emailAddress,
		Timestamp lastLoggedinTimestamp,
		String    employmentStatus,
		Timestamp joinedTimestamp,
		Integer   karma,
		Integer   totalViews,
		Integer   age,
		String    gender,
		String    salary,
		String    relationshipStatus,
		String    dreams,
		String    phoneNumber,
		String    employmentHistory,
		String    skills,
		Integer   schoolId,
		Integer   locationId,
		Integer   imageId
	) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.emailAddress = emailAddress;
		this.lastLoggedinTimestamp = lastLoggedinTimestamp;
		this.employmentStatus = employmentStatus;
		this.joinedTimestamp = joinedTimestamp;
		this.karma = karma;
		this.totalViews = totalViews;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.relationshipStatus = relationshipStatus;
		this.dreams = dreams;
		this.phoneNumber = phoneNumber;
		this.employmentHistory = employmentHistory;
		this.skills = skills;
		this.schoolId = schoolId;
		this.locationId = locationId;
		this.imageId = imageId;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getUsername() {
		return this.username;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public Timestamp getLastLoggedinTimestamp() {
		return this.lastLoggedinTimestamp;
	}

	public String getEmploymentStatus() {
		return this.employmentStatus;
	}

	public Timestamp getJoinedTimestamp() {
		return this.joinedTimestamp;
	}

	public Integer getKarma() {
		return this.karma;
	}

	public Integer getTotalViews() {
		return this.totalViews;
	}

	public Integer getAge() {
		return this.age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getSalary() {
		return this.salary;
	}

	public String getRelationshipStatus() {
		return this.relationshipStatus;
	}

	public String getDreams() {
		return this.dreams;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getEmploymentHistory() {
		return this.employmentHistory;
	}

	public String getSkills() {
		return this.skills;
	}

	public Integer getSchoolId() {
		return this.schoolId;
	}

	public Integer getLocationId() {
		return this.locationId;
	}

	public Integer getImageId() {
		return this.imageId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Student (");

		sb.append(studentId);
		sb.append(", ").append(firstName);
		sb.append(", ").append(lastName);
		sb.append(", ").append(username);
		sb.append(", ").append(emailAddress);
		sb.append(", ").append(lastLoggedinTimestamp);
		sb.append(", ").append(employmentStatus);
		sb.append(", ").append(joinedTimestamp);
		sb.append(", ").append(karma);
		sb.append(", ").append(totalViews);
		sb.append(", ").append(age);
		sb.append(", ").append(gender);
		sb.append(", ").append(salary);
		sb.append(", ").append(relationshipStatus);
		sb.append(", ").append(dreams);
		sb.append(", ").append(phoneNumber);
		sb.append(", ").append(employmentHistory);
		sb.append(", ").append(skills);
		sb.append(", ").append(schoolId);
		sb.append(", ").append(locationId);
		sb.append(", ").append(imageId);

		sb.append(")");
		return sb.toString();
	}
}
