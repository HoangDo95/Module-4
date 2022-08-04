package com.codegym.case_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class FuramaController {

    @GetMapping({"", "/home"})
    public String showHome(){
        return "/home";
    }

    @GetMapping("/login")
    public String showLogin(){
        return "/myLogin";
    }

    @GetMapping("/403")
    public String showError(){
        return "/error";
    }

}
