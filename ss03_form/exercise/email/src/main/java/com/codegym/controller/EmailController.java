package com.codegym.controller;

import com.codegym.model.Email;
import com.codegym.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EmailController {
    @Autowired
    EmailService emailService;

    @GetMapping("/email")
    public String showList(Model model) {
        List<Email> emailList = emailService.showAll();
        model.addAttribute("emailList", emailList);
        return "list";
    }

    @GetMapping("/edit")
    public ModelAndView showEdit(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("email", emailService.findId(id));
        modelAndView.addObject("sList", emailService.showString());
        modelAndView.addObject("iList", emailService.showInteger());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editEmail(@RequestParam int id, Email email, RedirectAttributes redirectAttributes) {
        emailService.edit(id, email);
        redirectAttributes.addFlashAttribute("mess","Edit" + email.getId());
        return "redirect:/email";
    }
}
