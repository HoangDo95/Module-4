package com.codegym.controller;

import com.codegym.model.Declaration;
import com.codegym.service.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DeclarationController {
    @Autowired
    DeclarationService declarationService;

    @GetMapping("/show")
    public String showList(Model model){
        List<Declaration> declarationList = declarationService.showList();
        model.addAttribute("declarationList",declarationList);
        return "list";
    }
}
