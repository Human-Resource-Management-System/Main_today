package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hrms_holidays")
public class Holiday {
	@Column(name = "year_id")
	private int year_id;
	@Id
	@Column(name = "hday_date")
	private Date hday_date;

	@Column(name = "hday_title")
	private String hday_title;

	@Column(name = "hday_type")
	private String hday_type;

	// Getters and setters

	public int getYear() {
		return year_id;
	}

	public void setYear(int year) {
		this.year_id = year;
	}

	// Getter and Setter for hday_date
	public Date getHday_date() {
		return hday_date;
	}

	public void setHday_date(Date hday_date) {
		this.hday_date = hday_date;
	}

	// Getter and Setter for hday_title
	public String getHday_title() {
		return hday_title;
	}

	public void setHday_title(String hday_title) {
		this.hday_title = hday_title;
	}

	// Getter and Setter for hday_type
	public String getHday_type() {
		return hday_type;
	}

	public void setHday_type(String hday_type) {
		this.hday_type = hday_type;
	}

}