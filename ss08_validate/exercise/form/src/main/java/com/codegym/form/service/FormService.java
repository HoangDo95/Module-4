package com.codegym.form.service;

import com.codegym.form.model.Form;

import java.util.List;

public interface FormService {
    List<Form> findAll();

    void save(Form form);


}
