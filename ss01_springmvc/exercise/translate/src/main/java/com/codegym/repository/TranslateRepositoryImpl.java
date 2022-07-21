package com.codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TranslateRepositoryImpl implements TranslateRepository{
    private static Map<String, String> mapList = new HashMap<>();

    static {
        mapList.put("hi","chao");
        mapList.put("name", "tem");
        mapList.put("class", "lop");
        mapList.put("age", "tuoi");
        mapList.put("number", "so");
    }

    @Override
    public String findAll(String keyWord) {
        return mapList.get(keyWord);
    }
}
