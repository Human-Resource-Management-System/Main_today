package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HRMS_Employeeredocuments")
public class EmployeeRedocuments {

	@Id
	@Column(name = "erfd_id")
	private int erfdId;

	@Column(name = "erfd_docname")
	private String documentName;

	@Column(name = "erfd_category")
	private String category;

	@Column(name = "erfd_desc")
	private String description;

	@Column(name = "erfd_luudate")
	private Date luuDate;

	@Column(name = "erfd_luser")
	private int luser;

	// Getters and setters

	public int getErfdId() {
		return erfdId;
	}

	public void setErfdId(int erfdId) {
		this.erfdId = erfdId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getLuuDate() {
		return luuDate;
	}

	public void setLuuDate(Date luuDate) {
		this.luuDate = luuDate;
	}

	public int getLuser() {
		return luser;
	}

	public void setLuser(int luser) {
		this.luser = luser;
	}
}
