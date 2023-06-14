package DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import models.Candidate;

@Repository
public class CandidateDAOImpl implements CandidateDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void saveCandidate(Candidate candidate) {
		sessionFactory.getCurrentSession().save(candidate);
	}

	@Override
	@Transactional
	public Candidate getCandidateById(int candidateId) {
		return sessionFactory.getCurrentSession().get(Candidate.class, candidateId);
	}
}
