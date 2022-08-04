package com.codegym.case_study.service.facility;

import com.codegym.case_study.model.employee.Employee;
import com.codegym.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface FacilityService {
    Page<Facility> findAll(Pageable pageable, String name);
    List<Facility> findAllFacility();

    void save(Facility facility);

    Optional<Facility> findById (Integer id);

    void update(Facility facility);

    void delete(int id);
}
