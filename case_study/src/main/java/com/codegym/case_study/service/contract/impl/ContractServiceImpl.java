package com.codegym.case_study.service.contract.impl;

import com.codegym.case_study.model.contract.Contract;
import com.codegym.case_study.repository.contract.ContractRepository;
import com.codegym.case_study.service.contract.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    public List<Contract> findAllContract(){
        return contractRepository.findAll();
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public Optional<Contract> findById(Integer id) {
        return contractRepository.findById(id);
    }

    @Override
    public void update(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void delete(int id) {
        contractRepository.deleteById(id);
    }
}
