package com.codegym.case_study.service.contract.impl;

import com.codegym.case_study.model.contract.AttachFacility;
import com.codegym.case_study.repository.contract.AttachFacilityRepository;
import com.codegym.case_study.service.contract.AttachFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttachFacilityServiceImpl implements AttachFacilityService {
    @Autowired
    AttachFacilityRepository attachFacilityRepository;

    @Override
    public List<AttachFacility> findAll() {
        return attachFacilityRepository.findAll();
    }
}
