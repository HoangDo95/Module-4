package com.codegym.case_study.service.employee;

import com.codegym.case_study.model.employee.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    void save(Employee employee);

    Optional<Employee> findById(Integer id);

    void update(Employee employee);

    void delete(int id);
}