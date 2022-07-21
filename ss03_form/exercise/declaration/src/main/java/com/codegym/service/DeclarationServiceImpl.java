package com.codegym.service;

import com.codegym.model.Declaration;
import com.codegym.repository.DeclarationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclarationServiceImpl implements DeclarationService {
    @Autowired
    DeclarationRepository declarationRepository;

    @Override
    public List<Declaration> showList() {
        return declarationRepository.showList();
    }

    @Override
    public String[] getBirthYear() {
        return declarationRepository.getBirthYear();
    }

    @Override
    public String[] getGender() {
        return declarationRepository.getGender();
    }

    @Override
    public String[] getNational() {
        return declarationRepository.getNational();
    }

    @Override
    public String[] getTransportType() {
        return declarationRepository.getTransportType();
    }

    @Override
    public String[] getInputDay() {
        return declarationRepository.getInputDay();
    }

    @Override
    public String[] getInputMonth() {
        return declarationRepository.getInputMonth();
    }

    @Override
    public String[] getInputYear() {
        return declarationRepository.getInputYear();
    }

    @Override
    public String[] getOutDay() {
        return declarationRepository.getOutDay();
    }

    @Override
    public String[] getOutMonth() {
        return declarationRepository.getOutMonth();
    }

    @Override
    public String[] getOutYear() {
        return declarationRepository.getOutYear();
    }

    @Override
    public void create(Declaration declaration) {
        declarationRepository.create(declaration);
    }

    @Override
    public Declaration findId(int id) {
        return declarationRepository.findId(id);
    }

    @Override
    public void edit(int id, Declaration declaration) {
        declarationRepository.edit(id, declaration);
    }
}
