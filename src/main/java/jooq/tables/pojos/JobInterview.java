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
public class JobInterview implements Serializable {

	private static final long serialVersionUID = -1823425582;

	private final Integer   jobInterviewId;
	private final String    status;
	private final Timestamp createdTimestamp;
	private final Integer   jobId;
	private final Integer   studentId;

	public JobInterview(JobInterview value) {
		this.jobInterviewId = value.jobInterviewId;
		this.status = value.status;
		this.createdTimestamp = value.createdTimestamp;
		this.jobId = value.jobId;
		this.studentId = value.studentId;
	}

	public JobInterview(
		Integer   jobInterviewId,
		String    status,
		Timestamp createdTimestamp,
		Integer   jobId,
		Integer   studentId
	) {
		this.jobInterviewId = jobInterviewId;
		this.status = status;
		this.createdTimestamp = createdTimestamp;
		this.jobId = jobId;
		this.studentId = studentId;
	}

	public Integer getJobInterviewId() {
		return this.jobInterviewId;
	}

	public String getStatus() {
		return this.status;
	}

	public Timestamp getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public Integer getJobId() {
		return this.jobId;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("JobInterview (");

		sb.append(jobInterviewId);
		sb.append(", ").append(status);
		sb.append(", ").append(createdTimestamp);
		sb.append(", ").append(jobId);
		sb.append(", ").append(studentId);

		sb.append(")");
		return sb.toString();
	}
}
