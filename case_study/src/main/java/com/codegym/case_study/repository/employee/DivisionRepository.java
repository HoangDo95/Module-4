package com.codegym.case_study.repository.employee;

import com.codegym.case_study.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DivisionRepository extends JpaRepository<Division,Integer> {
}
