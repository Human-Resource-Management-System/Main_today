package DAO;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import models.GradeHoliday;


@Repository
public class GradeHolidayDAOImpl implements GradeHolidayDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<GradeHoliday> findAllGradeHolidays() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<GradeHoliday> cq = cb.createQuery(GradeHoliday.class);
		Root<GradeHoliday> root = cq.from(GradeHoliday.class);
		cq.select(root);
		Query<GradeHoliday> query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public GradeHoliday findHolidayById(String id) {
		// TODO Auto-generated method stub
		return null;
	}



}