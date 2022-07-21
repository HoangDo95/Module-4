package com.codegym.service;

import com.codegym.model.Email;

import java.util.List;

public interface EmailService {
    List<Email> showAll();

    String[] showString();

    Integer[] showInteger();

    Email findId(Integer id);

    void edit(Integer id, Email email);
}
