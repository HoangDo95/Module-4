package com.codegym.case_study.service;

import com.codegym.case_study.model.customer.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();
}
