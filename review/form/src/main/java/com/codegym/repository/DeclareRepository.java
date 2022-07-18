package com.codegym.repository;

import com.codegym.model.Declare;

import java.util.List;

public interface DeclareRepository {
    List<Declare> showList();

    String[] showBirthDay();

    String[] showMove();

    String[] showStarDay();

    String[] showEndDay();

    void create(Declare declare);

    Declare findByID( int stt);

    void edit(int stt, Declare declare);
}
