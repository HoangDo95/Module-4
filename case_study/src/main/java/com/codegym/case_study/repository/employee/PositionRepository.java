package com.codegym.case_study.repository.employee;

import com.codegym.case_study.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PositionRepository extends JpaRepository<Position,Integer> {

}
