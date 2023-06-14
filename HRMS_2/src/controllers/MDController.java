package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DAO.EmployeeRefDAO;
import DAO.HolidayDAO;
import models.EmployeeRedocuments;
import models.Holiday;

@Controller
public class MDController {

	private final HolidayDAO hd;
	private final EmployeeRefDAO er;

	@Autowired
	public MDController(HolidayDAO holidayDAO, EmployeeRefDAO erd) {
		hd = holidayDAO;
		er = erd;
	}


	@GetMapping("/empldocx")
	public String showEmployeeDocumentsPage() {
		return "get-employee-documents";
	}

	@GetMapping("/displaydocx")
	public String getEmployeeDocuments(@RequestParam("erfd_id") int erfdId, Model model) {
		EmployeeRedocuments employeeRedocuments = er.findById(erfdId);
		model.addAttribute("employeeRedocuments", employeeRedocuments);
		return "displaydocx";
	}

	@RequestMapping(value = "/empholidays")
	public String getEmpHolidays(Model model) {
		return "emphol";
	}

	@RequestMapping(value = "/empleaves")
	public String getEmpLeaves(Model model) {
		return "emplev";
	}

	@RequestMapping(value = "/adhollev")
	public String getAD(Model model) {
		return "emphollev";
	}

}