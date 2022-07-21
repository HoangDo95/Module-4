package com.codegym.controller;

import com.codegym.model.Declaration;
import com.codegym.service.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class DeclarationController {
    @Autowired
    DeclarationService declarationService;

    @GetMapping("/list")
    public String showList(Model model) {
        List<Declaration> declarationList = declarationService.showList();
        model.addAttribute("declarationList", declarationList);
        return "list";
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("create", "declaration", new Declaration());
        modelAndView.addObject("birthdayList", declarationService.getBirthYear());
        modelAndView.addObject("genderList", declarationService.getGender());
        modelAndView.addObject("nalionalityList", declarationService.getNational());
        modelAndView.addObject("transportType", declarationService.getTransportType());
        modelAndView.addObject("inputDay", declarationService.getInputDay());
        modelAndView.addObject("inputMonth", declarationService.getInputMonth());
        modelAndView.addObject("inputYear", declarationService.getInputYear());
        modelAndView.addObject("outDay", declarationService.getOutDay());
        modelAndView.addObject("outMonth", declarationService.getOutMonth());
        modelAndView.addObject("outYear", declarationService.getOutYear());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Declaration declaration, RedirectAttributes redirectAttributes) {
        declarationService.create(declaration);
        redirectAttributes.addFlashAttribute("mess", "Create" + declaration.getName());
        return "redirect:/list";
    }

    @GetMapping("/edit")
    public ModelAndView showEdit(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("declaration", declarationService.findId(id));
        modelAndView.addObject("birthdayList", declarationService.getBirthYear());
        modelAndView.addObject("genderList", declarationService.getGender());
        modelAndView.addObject("nalionalityList", declarationService.getNational());
        modelAndView.addObject("transportType", declarationService.getTransportType());
        modelAndView.addObject("inputDay", declarationService.getInputDay());
        modelAndView.addObject("inputMonth", declarationService.getInputMonth());
        modelAndView.addObject("inputYear", declarationService.getInputYear());
        modelAndView.addObject("outDay", declarationService.getOutDay());
        modelAndView.addObject("outMonth", declarationService.getOutMonth());
        modelAndView.addObject("outYear", declarationService.getOutYear());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String edit(@RequestParam int id, Declaration declaration, RedirectAttributes redirectAttributes) {
        declarationService.edit(id, declaration);
        redirectAttributes.addFlashAttribute("mess", "Edit" + declaration.getName());
        return "redirect:/list";
    }
}
