package com.codegym.case_study.repository.customer;

import com.codegym.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query(value = " select * from customer where namec like :name ", nativeQuery = true)
    Page<Customer> findAll(Pageable pageable, @Param("name") String name);
}