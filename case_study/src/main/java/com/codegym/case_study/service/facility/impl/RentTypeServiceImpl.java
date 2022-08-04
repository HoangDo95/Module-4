package com.codegym.case_study.service.facility.impl;

import com.codegym.case_study.model.facility.RentType;
import com.codegym.case_study.repository.faciliry.RentTypeRepository;
import com.codegym.case_study.service.facility.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    RentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
