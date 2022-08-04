package com.codegym.case_study.service.contract.impl;

import com.codegym.case_study.model.contract.ContractDetail;
import com.codegym.case_study.repository.contract.ContractDetailRepository;
import com.codegym.case_study.service.contract.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    ContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }
}
