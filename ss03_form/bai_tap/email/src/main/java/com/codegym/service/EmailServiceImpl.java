package com.codegym.service;

import com.codegym.model.Email;
import com.codegym.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    EmailRepository emailRepository;

    @Override
    public List<Email> showAll() {
        return emailRepository.showAll();
    }

    @Override
    public String[] showString() {
        return emailRepository.showString();
    }

    @Override
    public Integer[] showInteger() {
        return emailRepository.showInteger();
    }

    @Override
    public Email findId(Integer id) {
        return emailRepository.findId(id);
    }

    @Override
    public void edit(Integer id, Email email) {
        emailRepository.edit(id, email);
    }
}
