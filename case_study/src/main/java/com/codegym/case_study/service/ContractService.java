package com.codegym.case_study.service;

import com.codegym.case_study.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);

    List<Contract> findAllContract();

    void save(Contract contract);

    Optional<Contract> findById(Integer id);

    void update(Contract contract);

    void delete(int id);

}
