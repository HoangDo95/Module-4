package com.codegym.case_study.repository.contract;

import com.codegym.case_study.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Integer> {

}
