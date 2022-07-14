package com.codegym.controller;

import com.codegym.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConvertController {
    @Autowired
    private ConvertService convertService;

    @GetMapping
    public String showList() {
        return "list";
    }

    @PostMapping
    public String convertCurrency(double rate, double usd, Model model) {
        double vnd = convertService.convert(rate, usd);
        model.addAttribute("vnd", vnd);
        return "list";
    }
}
