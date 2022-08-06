package com.codegym.case_study.service;

import com.codegym.case_study.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable, String name);

    List<Employee> findAllEmployee();

    void save(Employee employee);

    Optional<Employee> findById(Integer id);

    void update(Employee employee);

    void delete(int id);
}