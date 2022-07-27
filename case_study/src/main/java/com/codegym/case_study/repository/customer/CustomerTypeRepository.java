package com.codegym.case_study.repository.customer;

import com.codegym.case_study.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
