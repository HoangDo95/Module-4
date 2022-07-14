package com.codegym.service;

import com.codegym.repository.TranslateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslateServiceImpl implements TranslateService {
    @Autowired
    private TranslateRepository translateRepository;

    @Override
    public String findAll(String keyWord) {
        String result = translateRepository.findAll(keyWord);
        if (result == null) {
            return result = "not exits";
        }
        return result;
    }
}

