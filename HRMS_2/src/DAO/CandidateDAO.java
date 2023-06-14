package DAO;

import models.Candidate;

public interface CandidateDAO {
	void saveCandidate(Candidate candidate);

	Candidate getCandidateById(int candidateId);
}
