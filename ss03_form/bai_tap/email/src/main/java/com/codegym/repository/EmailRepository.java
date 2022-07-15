package com.codegym.repository;

import com.codegym.model.Email;

import java.util.List;

public interface EmailRepository {
    List<Email> showAll();

    List<String> showString();

    List<Integer> showInteger();

    Email findId(Integer id);

    void edit(Integer id, Email email);
}
