package DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import models.Induction;

@Repository
public class InductionDAOImpl implements InductionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void insertInduction(Induction induction) {
		sessionFactory.getCurrentSession().save(induction);
	}

	// Other methods and operations related to induction records

}
