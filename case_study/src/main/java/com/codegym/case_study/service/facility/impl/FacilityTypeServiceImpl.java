package com.codegym.case_study.service.facility.impl;

import com.codegym.case_study.model.Facility.FacilityType;
import com.codegym.case_study.repository.faciliry.FacilityTypeRepository;
import com.codegym.case_study.service.facility.FacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacilityTypeServiceImpl implements FacilityTypeService {
    @Autowired
    FacilityTypeRepository facilityTypeRepository;

    @Override
    public List<FacilityType> findAll() {
        return facilityTypeRepository.findAll();
    }
}
