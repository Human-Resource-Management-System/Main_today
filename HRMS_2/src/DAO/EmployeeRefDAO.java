package DAO;

import java.util.List;

import models.EmployeeRedocuments;

public interface EmployeeRefDAO {
	EmployeeRedocuments findById(int erfdId);

	List<EmployeeRedocuments> findAll();

	List<EmployeeRedocuments> findByDocumentDescription(String documentDescription);

	void save(EmployeeRedocuments employeeRedocuments);

	void update(EmployeeRedocuments employeeRedocuments);

	void delete(EmployeeRedocuments employeeRedocuments);
}
