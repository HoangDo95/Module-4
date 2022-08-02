package com.codegym.case_study.repository.faciliry;

import com.codegym.case_study.model.Facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentTypeRepository extends JpaRepository<RentType,Integer> {
}
