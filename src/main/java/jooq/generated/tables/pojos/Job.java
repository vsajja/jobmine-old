/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables.pojos;


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
public class Job implements Serializable {

	private static final long serialVersionUID = 1339112257;

	private final Long      jobId;
	private final String    title;
	private final String    description;
	private final Timestamp createdTimestamp;
	private final String    type;
	private final String    status;
	private final Integer   totalOpenings;
	private final Integer   jobMineId;
	private final Integer   companyId;
	private final Integer   locationId;

	public Job(Job value) {
		this.jobId = value.jobId;
		this.title = value.title;
		this.description = value.description;
		this.createdTimestamp = value.createdTimestamp;
		this.type = value.type;
		this.status = value.status;
		this.totalOpenings = value.totalOpenings;
		this.jobMineId = value.jobMineId;
		this.companyId = value.companyId;
		this.locationId = value.locationId;
	}

	public Job(
		Long      jobId,
		String    title,
		String    description,
		Timestamp createdTimestamp,
		String    type,
		String    status,
		Integer   totalOpenings,
		Integer   jobMineId,
		Integer   companyId,
		Integer   locationId
	) {
		this.jobId = jobId;
		this.title = title;
		this.description = description;
		this.createdTimestamp = createdTimestamp;
		this.type = type;
		this.status = status;
		this.totalOpenings = totalOpenings;
		this.jobMineId = jobMineId;
		this.companyId = companyId;
		this.locationId = locationId;
	}

	public Long getJobId() {
		return this.jobId;
	}

	public String getTitle() {
		return this.title;
	}

	public String getDescription() {
		return this.description;
	}

	public Timestamp getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public String getType() {
		return this.type;
	}

	public String getStatus() {
		return this.status;
	}

	public Integer getTotalOpenings() {
		return this.totalOpenings;
	}

	public Integer getJobMineId() {
		return this.jobMineId;
	}

	public Integer getCompanyId() {
		return this.companyId;
	}

	public Integer getLocationId() {
		return this.locationId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Job (");

		sb.append(jobId);
		sb.append(", ").append(title);
		sb.append(", ").append(description);
		sb.append(", ").append(createdTimestamp);
		sb.append(", ").append(type);
		sb.append(", ").append(status);
		sb.append(", ").append(totalOpenings);
		sb.append(", ").append(jobMineId);
		sb.append(", ").append(companyId);
		sb.append(", ").append(locationId);

		sb.append(")");
		return sb.toString();
	}
}
