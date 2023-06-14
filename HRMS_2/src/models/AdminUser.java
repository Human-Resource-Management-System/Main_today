package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hrms_adminusers")
public class AdminUser {

	@Id
	@Column(name = "ausr_id")
	private Integer adminUserId;

	@Column(name = "ausr_name")
	private String adminUserName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ausr_empl_id", referencedColumnName = "empl_id")
	private Employee employee;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ausr_empl_jbgr", referencedColumnName = "jbgr_id")
	private JobGrade jobGrade;

	// Constructors, getters, and setters

	public Integer getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(Integer adminUserId) {
		this.adminUserId = adminUserId;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public JobGrade getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(JobGrade jobGrade) {
		this.jobGrade = jobGrade;
	}
}
