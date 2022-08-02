package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
    @GetMapping("/home")
    public String showPageHome(){
        return "/home";
    }
    @GetMapping("/c0322g1")
    public String showPageLogin(){
        return "/myLogin";
    }

}
