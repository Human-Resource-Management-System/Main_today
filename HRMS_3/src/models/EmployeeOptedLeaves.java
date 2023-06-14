package models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ch_EmployeeOptedLeaves")
public class EmployeeOptedLeaves {
	@Id
	@Column(name = "eolv_date")
	private Date eolv_date;

	@ManyToOne
	@JoinColumn(name = "empl_id")
	private Employee employee;

	public Date getEolv_date() {
		return eolv_date;
	}

	public void setEolv_date(Date eolv_date) {
		this.eolv_date = eolv_date;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getYear_id() {
		return year_id;
	}

	public void setYear_id(int year_id) {
		this.year_id = year_id;
	}

	public String getEolv_leavetype() {
		return eolv_leavetype;
	}

	public void setEolv_leavetype(String eolv_leavetype) {
		this.eolv_leavetype = eolv_leavetype;
	}

	private int year_id;
	private String eolv_leavetype;

	// Other opted leaves properties

	// Getters and setters
}
