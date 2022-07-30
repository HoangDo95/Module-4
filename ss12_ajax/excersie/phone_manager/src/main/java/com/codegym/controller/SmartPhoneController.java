package com.codegym.controller;

import com.codegym.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmartPhoneController {
    @Autowired
    private SmartPhoneService smartPhoneService;

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }
}
