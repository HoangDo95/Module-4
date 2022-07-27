package com.codegym.case_study.service.employee.impl;

import com.codegym.case_study.model.employee.Position;
import com.codegym.case_study.repository.employee.PositionRepository;
import com.codegym.case_study.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
