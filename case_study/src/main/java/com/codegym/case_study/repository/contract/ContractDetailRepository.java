package com.codegym.case_study.repository.contract;

import com.codegym.case_study.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
}
