package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class SandwichServiceImpl implements SandwichService {

    @Override
    public String save(String[] condiment) {
        String sandwich = "";
        for (String item : condiment) {
            sandwich += item + (" ");
        }
        return sandwich;
    }
}

