package com.codegym.controller;

import com.codegym.service.MoneyService;
import com.codegym.service.MoneyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class MoneyController {
    @Autowired
    MoneyService moneyService = new MoneyServiceImpl();

    @GetMapping("/money")
    String showList() {
        return "list";
    }

    @PostMapping("/money")
    String save(@RequestParam(defaultValue = "0") double rate, @RequestParam(defaultValue = "0") double usd, Model model) {
        Double result = moneyService.save(rate, usd);
        model.addAttribute("result", result);
        return "list";
    }


}
