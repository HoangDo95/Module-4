package com.codegym.case_study.service.customer;

import com.codegym.case_study.model.customer.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(Integer id);

    void update(Customer customer);
}
