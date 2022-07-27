package com.codegym.case_study.service.customer;

import com.codegym.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable, String name);

    void save(Customer customer);

    Optional<Customer> findById (Integer id);

    void update(Customer customer);

    void delete(int id);
}
