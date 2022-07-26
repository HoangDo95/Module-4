package com.codegym.service;

import com.codegym.model.PersonBorrow;
import com.codegym.repository.PersonBorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonBorrowServiceImpl implements PersonBorrowService {
    @Autowired
    PersonBorrowRepository personBorrowRepository;

    @Override
    public List<PersonBorrow> findAll() {
        return personBorrowRepository.findAll();
    }
}
