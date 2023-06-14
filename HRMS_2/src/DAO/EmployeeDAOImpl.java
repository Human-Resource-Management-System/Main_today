package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import models.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Object[]> getAllEmployees() {
		Session session = sessionFactory.getCurrentSession();

		// Use a custom Hibernate query to select specific columns
		String query = "SELECT e.emplId, e.emplFirstname, e.emplLastname, e.emplSurname FROM Employee e";
		List<Object[]> employees = session.createQuery(query, Object[].class).getResultList();

		return employees;
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee employee = session.get(Employee.class, id);
		return employee;

	}
}
