package com.codegym.case_study.service.impl;

import com.codegym.case_study.model.customer.CustomerType;
import com.codegym.case_study.repository.customer.CustomerTypeRepository;
import com.codegym.case_study.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
