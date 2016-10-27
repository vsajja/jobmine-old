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
public class JobPosting implements Serializable {

	private static final long serialVersionUID = 1363701766;

	private final Integer jobpostingid;
	private final String  title;
	private final String  description_9;
	private final String  location;
	private final Date    dateposted_9;
	private final String  employername;
	private final byte[]  employerlogo;

	public JobPosting(JobPosting value) {
		this.jobpostingid = value.jobpostingid;
		this.title = value.title;
		this.description_9 = value.description_9;
		this.location = value.location;
		this.dateposted_9 = value.dateposted_9;
		this.employername = value.employername;
		this.employerlogo = value.employerlogo;
	}

	public JobPosting(
		Integer jobpostingid,
		String  title,
		String  description_9,
		String  location,
		Date    dateposted_9,
		String  employername,
		byte[]  employerlogo
	) {
		this.jobpostingid = jobpostingid;
		this.title = title;
		this.description_9 = description_9;
		this.location = location;
		this.dateposted_9 = dateposted_9;
		this.employername = employername;
		this.employerlogo = employerlogo;
	}

	public Integer getJobpostingid() {
		return this.jobpostingid;
	}

	public String getTitle() {
		return this.title;
	}

	public String getDescription_9() {
		return this.description_9;
	}

	public String getLocation() {
		return this.location;
	}

	public Date getDateposted_9() {
		return this.dateposted_9;
	}

	public String getEmployername() {
		return this.employername;
	}

	public byte[] getEmployerlogo() {
		return this.employerlogo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("JobPosting (");

		sb.append(jobpostingid);
		sb.append(", ").append(title);
		sb.append(", ").append(description_9);
		sb.append(", ").append(location);
		sb.append(", ").append(dateposted_9);
		sb.append(", ").append(employername);
		sb.append(", ").append("[binary...]");

		sb.append(")");
		return sb.toString();
	}
}