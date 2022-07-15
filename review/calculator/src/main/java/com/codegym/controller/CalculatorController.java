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
    public String showView(){
        return "list";
    }

    @PostMapping
    public String submit(@RequestParam double num1, double num2, String item, Model model){
        double result = calculatorService.submit(num1,num2,item);
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("result",result);
        return "list";
    }
}
