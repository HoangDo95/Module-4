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

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("declaration", new Declaration());
        model.addAttribute("birthdayList", declarationService.getBirthYear());
        model.addAttribute("genderList", declarationService.getGender());
        model.addAttribute("nalionalityList", declarationService.getNational());
        model.addAttribute("transportType", declarationService.getTransportType());
        model.addAttribute("inputDay", declarationService.getInputDay());
        model.addAttribute("inputMonth", declarationService.getInputMonth());
        model.addAttribute("inputYear", declarationService.getInputYear());
        model.addAttribute("outDay", declarationService.getOutDay());
        model.addAttribute("outMonth", declarationService.getOutMonth());
        model.addAttribute("outYear", declarationService.getOutYear());
        return "crate";
    }
}
