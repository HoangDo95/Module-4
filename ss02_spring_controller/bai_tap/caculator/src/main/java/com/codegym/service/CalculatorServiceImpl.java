package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public double save(double num1, double num2, String operator) {
        switch (operator){
            case "CONG":
                return num1 + num2;
            case "TRU":
                return num1 - num2;
            case "NHAN":
                return num1 * num2;
            case "CHIA":
                return num1 / num2;
            default:
                return 0;
        }
    }
}
