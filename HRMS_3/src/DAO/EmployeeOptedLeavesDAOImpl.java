package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import models.Employee;
import models.EmployeeOptedLeaves;

@Repository
public class EmployeeOptedLeavesDAOImpl implements EmployeeOptedLeavesDAO {
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<EmployeeOptedLeaves> getOptedLeavesByEmployee(Employee employee) {
        TypedQuery<EmployeeOptedLeaves> query = entityManager.createQuery("SELECT eol FROM EmployeeOptedLeaves eol WHERE eol.employee = :employee",
                EmployeeOptedLeaves.class);
        query.setParameter("employee", employee);
        return query.getResultList();
    }
}

