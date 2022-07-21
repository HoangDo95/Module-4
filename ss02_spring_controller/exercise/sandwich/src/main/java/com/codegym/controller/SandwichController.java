package com.codegym.controller;

import com.codegym.service.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @Autowired
    SandwichService sandwichService;

    @GetMapping("/sandwich")
    public String showList() {
        return "list";
    }

    @PostMapping
    public String save(@RequestParam(value = "condiment", defaultValue = "pls check") String[] condiment, Model model) {
        String result = sandwichService.save(condiment);
        model.addAttribute("result", result);
        return "list";
    }
}
