package com.codegym.service;

import com.codegym.model.Declare;

import java.util.List;

public interface DeclareService {
    List<Declare> showList();

    String[] showBirthDay();

    String[] showMove();

    String[] showStarDay();

    String[] showEndDay();

    void create(Declare declare);

    Declare findByID( int stt);

    void edit(int stt, Declare declare);
}
