package DAO;

import java.util.List;

import models.Employee;
import models.EmployeeOptedLeaves;
public interface EmployeeOptedLeavesDAO {
    List<EmployeeOptedLeaves> getOptedLeavesByEmployee(Employee employee);
}
