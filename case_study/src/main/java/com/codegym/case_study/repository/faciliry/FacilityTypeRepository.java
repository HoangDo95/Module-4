package com.codegym.case_study.repository.faciliry;

import com.codegym.case_study.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityTypeRepository extends JpaRepository<FacilityType,Integer> {
}
