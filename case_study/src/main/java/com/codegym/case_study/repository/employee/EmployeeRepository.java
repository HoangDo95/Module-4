package com.codegym.case_study.repository.employee;

import com.codegym.case_study.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
