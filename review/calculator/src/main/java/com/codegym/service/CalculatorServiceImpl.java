package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public double submit(double num1, double num2, String item) {
        switch (item){
            case "cong":
                return num1 + num2;
            case "tru":
                return num1 - num2;
            case "nhan":
                return num1 * num2;
            case "chia":
                return num1 / num2;
        }
        return 0;
    }
}
