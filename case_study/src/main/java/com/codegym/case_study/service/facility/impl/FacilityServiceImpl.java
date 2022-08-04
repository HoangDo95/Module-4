package com.codegym.case_study.service.facility.impl;

import com.codegym.case_study.model.facility.Facility;
import com.codegym.case_study.repository.faciliry.FacilityRepository;
import com.codegym.case_study.service.facility.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Autowired
    FacilityRepository facilityRepository;

    @Override
    public Page<Facility> findAll(Pageable pageable, String name) {
        return facilityRepository.findAll(pageable, "%" + name + "%");
    }

    @Override
    public List<Facility> findAllFacility() {
        return facilityRepository.findAll();
    }

    @Override
    public void save(Facility facility) {
        facilityRepository.save(facility);
    }

    @Override
    public Optional<Facility> findById(Integer id) {
        return facilityRepository.findById(id);
    }

    @Override
    public void update(Facility facility) {
        facilityRepository.save(facility);
    }

    @Override
    public void delete(int id) {
        facilityRepository.deleteById(id);
    }
}
