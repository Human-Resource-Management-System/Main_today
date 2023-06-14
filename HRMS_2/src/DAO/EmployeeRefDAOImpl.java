package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import models.EmployeeRedocuments;

@Repository
@Transactional
public class EmployeeRefDAOImpl implements EmployeeRefDAO {

	private final SessionFactory sessionFactory;

	@Autowired
	public EmployeeRefDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public EmployeeRedocuments findById(int erfdId) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(EmployeeRedocuments.class, erfdId);
	}

	@Override
	public List<EmployeeRedocuments> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM EmployeeRedocuments", EmployeeRedocuments.class).getResultList();
	}

	@Override
	public List<EmployeeRedocuments> findByDocumentDescription(String documentDescription) {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM EmployeeRedocuments WHERE erfdDesc = :description", EmployeeRedocuments.class)
				.setParameter("description", documentDescription).getResultList();
	}

	@Override
	public void save(EmployeeRedocuments employeeRedocuments) {
		Session session = sessionFactory.getCurrentSession();
		session.save(employeeRedocuments);
	}

	@Override
	public void update(EmployeeRedocuments employeeRedocuments) {
		Session session = sessionFactory.getCurrentSession();
		session.update(employeeRedocuments);
	}

	@Override
	public void delete(EmployeeRedocuments employeeRedocuments) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(employeeRedocuments);
	}
}
