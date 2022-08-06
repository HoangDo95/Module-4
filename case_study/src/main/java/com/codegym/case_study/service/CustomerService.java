package com.codegym.case_study.service;

import com.codegym.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable, String name);

    List<Customer> findAllCustomer();

    void save(Customer customer);

    Optional<Customer> findById (Integer id);

    void update(Customer customer);

    void delete(int id);
}