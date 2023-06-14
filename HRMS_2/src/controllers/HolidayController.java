package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import DAO.GradeHolidayDAO;
import DAO.HolidayDAO;
import models.GradeHoliday;
import models.Holiday;

@Controller
public class HolidayController {

	private final HolidayDAO hd;
	private final GradeHolidayDAO gd;

	@Autowired
	public HolidayController(HolidayDAO holidayDAO, GradeHolidayDAO gradeholidayDAO) {
		hd = holidayDAO;
		gd = gradeholidayDAO;
	}

	@RequestMapping(value = "/getdashboard")
	public String getdashboard(Model model) {
		return "log";
	}

	@RequestMapping("/getholidays")
	public String showHolidays(Model model) {
		List<Holiday> holidays = hd.findAllHolidays();
		model.addAttribute("holidays", holidays);
		return "holidays";
	}

	@RequestMapping("/getgradewiseholidays")
	public String getgradewiseHolidays(Model model) {
		List<GradeHoliday> gradeholidays = gd.findAllGradeHolidays();
		model.addAttribute("gradeholidays", gradeholidays);
		return "gradeholidays";
	}
}
