package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hrms_jobgrades")
public class JobGrade {

	@Id
	@Column(name = "jbgr_id")
	private String jobGradeId;

	@Column(name = "jbgr_name")
	private String jobGradeName;

	@Column(name = "jbgr_desc")
	private String jobGradeDescription;

	// Constructors, getters, and setters

	public String getJobGradeId() {
		return jobGradeId;
	}

	public void setJobGradeId(String jobGradeId) {
		this.jobGradeId = jobGradeId;
	}

	public String getJobGradeName() {
		return jobGradeName;
	}

	public void setJobGradeName(String jobGradeName) {
		this.jobGradeName = jobGradeName;
	}

	public String getJobGradeDescription() {
		return jobGradeDescription;
	}

	public void setJobGradeDescription(String jobGradeDescription) {
		this.jobGradeDescription = jobGradeDescription;
	}
}
