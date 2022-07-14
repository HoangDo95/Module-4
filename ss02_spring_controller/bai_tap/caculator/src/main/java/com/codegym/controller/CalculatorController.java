package com.codegym.controller;

import com.codegym.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/calculator")
    String showList() {
        return "list";
    }

    @PostMapping("/calculator")
    String save(@RequestParam double num1, double num2, String operator, Model model) {
        double result = calculatorService.save(num1, num2, operator);
        model.addAttribute("result", result);
        return "list";
    }
}
