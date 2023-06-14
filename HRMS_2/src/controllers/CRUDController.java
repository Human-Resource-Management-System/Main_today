package controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import DAO.CandidateDAO;
import DAO.EmployeeDAO;
import DAO.InductionDAO;
import models.Candidate;
import models.Employee;
import models.Induction;
import models.InductionId;

@Controller
public class CRUDController {

	private final EmployeeDAO emp;
	private InductionDAO ids;
	private Induction i;
	private InductionId iid;
	private CandidateDAO cdao;
	private Candidate cdd;

	@Autowired
	public CRUDController(EmployeeDAO ed, CandidateDAO cd, Candidate cds, InductionDAO idao, Induction indu,
			InductionId iids) {
		emp = ed;
		cdao = cd;
		cdd = cds;
		ids = idao;
		i = indu;
		iid = iids;
	}

	@RequestMapping("/employees")
	public String showEmployees(Model model) {
		List<Object[]> employees = emp.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employees";
	}

	@GetMapping("/get-employee-details")
	public String getEmployeeDetails(@RequestParam("id") int employeeId, Model model) {
		Employee employee = emp.getEmployeeById(employeeId);
		model.addAttribute("employee", employee);
		return "get-employee-details";
	}

	@RequestMapping(value = "/addempl")
	public String addEmpl(Model model) {

		return "addempl";
	}

	@RequestMapping(value = "/delempl")
	public String delEmpl(Model model) {

		return "delempl";
	}

	@RequestMapping(value = "/candidate", method = RequestMethod.GET)
	public String showCandidateForm() {
		return "candidate";
	}

	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String saveCandidate(@RequestParam("firstName") String firstName,
			@RequestParam("middleName") String middleName, @RequestParam("lastName") String lastName,
			@RequestParam("rDate") Date rDate, @RequestParam("gender") String gender, @RequestParam("dob") Date dob,
			@RequestParam("email") String email, @RequestParam("mobile") Long mobile,
			@RequestParam("address") String address, @RequestParam("ludate") Date ludate,
			@RequestParam("status") String status, Model model) {

		cdd.setCandFirstName(firstName);
		cdd.setCandMiddleName(middleName);
		cdd.setCandLastName(lastName);
		cdd.setCandRDate(rDate);
		cdd.setCandGender(gender);
		cdd.setCandDOB(dob);
		cdd.setCandEmail(email);
		cdd.setCandMobile(mobile);
		cdd.setCandAddress(address);
		cdd.setCandLUDate(ludate);
		cdd.setCandStatus(status);

		cdao.saveCandidate(cdd);

		model.addAttribute("message", "Candidate details saved successfully!");
		return "success";
	}

	@RequestMapping(value = "/candidateview")
	public String getCandidates(Model model) {

		return "viewcandidate";
	}

	@RequestMapping(value = "/induction", method = RequestMethod.GET)
	public String showInductionForm() {
		return "induction";
	}

	@RequestMapping(value = "/success2", method = RequestMethod.POST)
	public String submitInduction(@RequestParam("indc_id") int indcId, @RequestParam("indc_emof_id") int indcEmofId,
			@RequestParam("indcDate") Date indcDate, @RequestParam("indc_processes_ausr_id") int indcProcessesAusrId,
			@RequestParam("status") String indcStatus, Model model) {

		iid.setindc_id(indcId);
		iid.setindc_emof_id(indcEmofId);
		i.setId(iid);
		i.setInductionDate(indcDate);
		i.setIndcProcessesAusrId(indcProcessesAusrId);
		i.setStatus(indcStatus);

		// Call the DAO to insert the induction record
		ids.insertInduction(i);

		// Add success message or any other data to the model
		model.addAttribute("message", "Induction record submitted successfully!");

		// Return the view name for the success.jsp
		return "success2";
	}

	@RequestMapping(value = "/inductionview")
	public String getInduction(Model model) {

		return "viewinduction";
	}

}
