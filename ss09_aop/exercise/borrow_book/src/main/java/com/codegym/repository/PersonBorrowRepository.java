package com.codegym.repository;

import com.codegym.model.PersonBorrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonBorrowRepository extends JpaRepository<PersonBorrow, Integer> {
}
