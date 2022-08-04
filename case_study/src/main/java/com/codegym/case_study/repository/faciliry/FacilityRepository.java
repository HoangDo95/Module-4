package com.codegym.case_study.repository.faciliry;

import com.codegym.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FacilityRepository extends JpaRepository<Facility,Integer> {

    @Query(value = " select * from facility where namef like :name ", nativeQuery = true)
    Page<Facility> findAll(Pageable pageable, @Param("name") String name);
}
