package com.codegym.case_study.service.facility;

import com.codegym.case_study.model.Facility.Facility;
import com.codegym.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface FacilityService {
    Page<Facility> findAll(Pageable pageable, String name);

    void save(Facility facility);

    Optional<Facility> findById (Integer id);

    void update(Facility facility);

    void delete(int id);
}
