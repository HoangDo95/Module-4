package com.codegym.service;

import com.codegym.model.Declare;
import com.codegym.repository.DeclareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclareServiceImpl implements DeclareService{
    @Autowired
    DeclareRepository declareRepository;

    @Override
    public List<Declare> showList() {
        return declareRepository.showList();
    }

    @Override
    public String[] showBirthDay() {
        return declareRepository.showBirthDay();
    }

    @Override
    public String[] showMove() {
        return declareRepository.showMove();
    }

    @Override
    public String[] showStarDay() {
        return declareRepository.showStarDay();
    }

    @Override
    public String[] showEndDay() {
        return declareRepository.showEndDay();
    }

    @Override
    public void create(Declare declare) {
        declareRepository.create(declare);
    }

    @Override
    public Declare findByID(int stt) {
        return declareRepository.findByID(stt);
    }

    @Override
    public void edit(int stt, Declare declare) {
        declareRepository.edit(stt,declare);
    }
}
