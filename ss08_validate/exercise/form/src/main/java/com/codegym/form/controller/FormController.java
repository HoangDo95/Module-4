package com.codegym.form.controller;

import com.codegym.form.dto.FormDto;
import com.codegym.form.model.Form;
import com.codegym.form.repository.FormRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormController {
    @Autowired
    FormRepository formRepository;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("formList", formRepository.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("form", new FormDto());
        return "/create";
    }

    @PostMapping("/save")
    public String createFrom(@Validated @ModelAttribute("form") FormDto formDto, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        } else {
            Form form = new Form();
            BeanUtils.copyProperties(formDto, form);
            formRepository.save(form);
            return "redirect:/form";
        }
    }
}
