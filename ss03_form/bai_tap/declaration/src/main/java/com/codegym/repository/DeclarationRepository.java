package com.codegym.repository;

import com.codegym.model.Declaration;

import java.util.List;

public interface DeclarationRepository {
    List<Declaration> showList();

    String[] getBirthYear();

    String[] getGender();

    String[] getNational();

    String[] getTransportType();

    String[] getInputDay();

    String[] getInputMonth();

    String[] getInputYear();

    String[] getOutDay();

    String[] getOutMonth();

    String[] getOutYear();

    void create(Declaration declaration);

    Declaration findId(int id);

    void edit(int id, Declaration declaration);
}
