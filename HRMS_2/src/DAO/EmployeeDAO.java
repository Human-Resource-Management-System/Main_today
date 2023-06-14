package DAO;

import java.util.List;

import models.Employee;

public interface EmployeeDAO {
	List<Object[]> getAllEmployees();

	Employee getEmployeeById(int id);
}
