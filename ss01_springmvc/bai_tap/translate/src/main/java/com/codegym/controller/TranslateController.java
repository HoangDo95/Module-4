package com.codegym.controller;

import com.codegym.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TranslateController {
    @Autowired
    private TranslateService translateService;

    @GetMapping("/translate")
    public String showList() {
        return "list";
    }

    @PostMapping("/translate")
    public String findAll(@RequestParam String keyWord, Model model) {
        String result = translateService.findAll(keyWord);
        model.addAttribute("result", result);
        return "list";
    }
}
