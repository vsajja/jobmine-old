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
public class JobOffer implements Serializable {

	private static final long serialVersionUID = -1520338907;

	private final Long      jobOfferId;
	private final Timestamp expiryTimestamp;
	private final String    salary;
	private final Integer   jobId;
	private final Integer   studentId;

	public JobOffer(JobOffer value) {
		this.jobOfferId = value.jobOfferId;
		this.expiryTimestamp = value.expiryTimestamp;
		this.salary = value.salary;
		this.jobId = value.jobId;
		this.studentId = value.studentId;
	}

	public JobOffer(
		Long      jobOfferId,
		Timestamp expiryTimestamp,
		String    salary,
		Integer   jobId,
		Integer   studentId
	) {
		this.jobOfferId = jobOfferId;
		this.expiryTimestamp = expiryTimestamp;
		this.salary = salary;
		this.jobId = jobId;
		this.studentId = studentId;
	}

	public Long getJobOfferId() {
		return this.jobOfferId;
	}

	public Timestamp getExpiryTimestamp() {
		return this.expiryTimestamp;
	}

	public String getSalary() {
		return this.salary;
	}

	public Integer getJobId() {
		return this.jobId;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final JobOffer other = (JobOffer) obj;
		if (jobOfferId == null) {
			if (other.jobOfferId != null)
				return false;
		}
		else if (!jobOfferId.equals(other.jobOfferId))
			return false;
		if (expiryTimestamp == null) {
			if (other.expiryTimestamp != null)
				return false;
		}
		else if (!expiryTimestamp.equals(other.expiryTimestamp))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		}
		else if (!salary.equals(other.salary))
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		}
		else if (!jobId.equals(other.jobId))
			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		}
		else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jobOfferId == null) ? 0 : jobOfferId.hashCode());
		result = prime * result + ((expiryTimestamp == null) ? 0 : expiryTimestamp.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("JobOffer (");

		sb.append(jobOfferId);
		sb.append(", ").append(expiryTimestamp);
		sb.append(", ").append(salary);
		sb.append(", ").append(jobId);
		sb.append(", ").append(studentId);

		sb.append(")");
		return sb.toString();
	}
}
