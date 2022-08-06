package com.codegym.case_study.service.impl;

import com.codegym.case_study.model.employee.Division;
import com.codegym.case_study.repository.employee.DivisionRepository;
import com.codegym.case_study.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    DivisionRepository divisionRepository;
    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
