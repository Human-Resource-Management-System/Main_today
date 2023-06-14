package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DAO.CandidateDAO;
import models.Candidate;

@Controller
public class CandidateController {

	private CandidateDAO candidateDAO;

	public CandidateController(CandidateDAO candidateDAO) {
		this.candidateDAO = candidateDAO;
	}

	@GetMapping("/candid")
	public String showEmployeeDocumentsPage() {
		return "getcandidate";
	}

	@GetMapping("/viewcandidate")
	public String getCandidateDetails(@RequestParam("candId") int candidateId, Model model) {
		Candidate candidate = candidateDAO.getCandidateById(candidateId);
		if (candidate != null) {
			model.addAttribute("candidate", candidate);
		} else {
			model.addAttribute("error", "No candidate found with the provided ID.");
		}
		return "viewcandidate";
	}
}
