package com.codegym.case_study.service.impl;

import com.codegym.case_study.model.employee.EducationDegree;
import com.codegym.case_study.repository.employee.EducationDegreeRepository;
import com.codegym.case_study.service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    EducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
