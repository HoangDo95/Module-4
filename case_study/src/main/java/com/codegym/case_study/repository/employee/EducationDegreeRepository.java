package com.codegym.case_study.repository.employee;

import com.codegym.case_study.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationDegreeRepository extends JpaRepository<EducationDegree,Integer> {

}
