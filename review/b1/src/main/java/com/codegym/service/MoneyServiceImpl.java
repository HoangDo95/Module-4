package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class MoneyServiceImpl implements MoneyService {
    @Override
    public double save(double rate, double usd) {
        return rate * usd;
    }
}
