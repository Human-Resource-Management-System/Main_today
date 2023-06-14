package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import DAO.EmployeeDAO;
import DAO.EmployeeOptedLeavesDAO;
import DAO.JobGradeHolidaysDAO;
import DAO.JobGradeLeavesDAO;
import models.Employee;
import models.EmployeeOptedLeaves;
import models.JobGradeHolidays;
import models.JobGradeLeaves;
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO;
    
    @Autowired
    private JobGradeHolidaysDAO jobGradeHolidaysDAO;
    
    @Autowired
    private JobGradeLeavesDAO jobGradeLeavesDAO;
    
    @Autowired
    private EmployeeOptedLeavesDAO employeeOptedLeavesDAO;
    
    // Other DAOs and services
    public void setJobGradeHolidaysDAO(JobGradeHolidaysDAO jobGradeHolidaysDAO) {
        // Set the jobGradeHolidaysDAO property
        this.jobGradeHolidaysDAO = jobGradeHolidaysDAO;
    }
    
    public void setJobGradeLeavesDAO(JobGradeLeavesDAO jobGradeLeavesDAO) {

        this.jobGradeLeavesDAO = jobGradeLeavesDAO;
    }
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void setEmployeeOptedLeavesDAO(EmployeeOptedLeavesDAO employeeOptedLeavesDAO) {
    	this.employeeOptedLeavesDAO = employeeOptedLeavesDAO;
    }
    
    @GetMapping("/employee/{emplId}")
    public String displayEmployeeInformation(@PathVariable int emplId, Model model) {
        Employee employee = employeeDAO.getEmployeeById(emplId);
        if (employee != null) {
            List<EmployeeOptedLeaves> optedLeaves = employeeOptedLeavesDAO.getOptedLeavesByEmployee(employee);
            JobGradeHolidays jobGradeHolidays = jobGradeHolidaysDAO.getJobGradeHolidaysByGrade(employee.getEmplJbgrId());
            JobGradeLeaves jobGradeLeaves = jobGradeLeavesDAO.getJobGradeLeavesByGrade(employee.getEmplJbgrId());
            // Calculate used holidays
            int usedHolidays = 0;
            for (EmployeeOptedLeaves leave : optedLeaves) {
                if (!leave.getEolv_leavetype().equals("MAND")) {
                    usedHolidays++;
                }
            }
            
            // Calculate remaining holidays
            int remainingHolidays = jobGradeHolidays.getJbgr_totalnoh() - usedHolidays;
            
            model.addAttribute("employee", employee);
            model.addAttribute("optedLeaves", optedLeaves);
            model.addAttribute("jobGradeHolidays", jobGradeHolidays);
            model.addAttribute("usedHolidays", usedHolidays);
            model.addAttribute("remainingHolidays", remainingHolidays);
            model.addAttribute("jobGradeLeaves",jobGradeLeaves);
            
            return "employee-information";
        } else {
            // Handle case when employee is not found
            throw new EmployeeNotFoundException("Employee not found with ID: " + emplId);
        }
    }
    
    // Other controller methods
    
    @ExceptionHandler(EmployeeNotFoundException.class)
    public String handleEmployeeNotFoundException(EmployeeNotFoundException ex, Model model) {
        model.addAttribute("errorMessage", ex.getMessage());
        return "error-page";
    }
}
