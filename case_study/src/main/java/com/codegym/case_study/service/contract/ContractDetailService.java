package com.codegym.case_study.service.contract;

import com.codegym.case_study.model.contract.AttachFacility;
import com.codegym.case_study.model.contract.ContractDetail;

import java.util.List;

public interface ContractDetailService {
    List<ContractDetail> findAll();
}
