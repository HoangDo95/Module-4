package com.codegym.controller;

import com.codegym.model.Declare;
import com.codegym.service.DeclareService;
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
public class DeclareController {
    @Autowired
    DeclareService declareService;

    @GetMapping("/list")
    public String showList(Model model){
        List<Declare> declareList = declareService.showList();
        model.addAttribute("declareList",declareList);
        return "list";
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create", "declare", new Declare());
        modelAndView.addObject("birthDayList",declareService.showBirthDay());
        modelAndView.addObject("moveList",declareService.showMove());
        modelAndView.addObject("starDayList",declareService.showStarDay());
        modelAndView.addObject("endDayList",declareService.showEndDay());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("declare") Declare declare, RedirectAttributes redirectAttributes){
        declareService.create(declare);
        redirectAttributes.addFlashAttribute("mess","create done");
        return "redirect:/list";
    }
    @GetMapping("/edit")
    public ModelAndView showEdit(@RequestParam int stt){
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("declare",declareService.findByID(stt));
        modelAndView.addObject("birthDayList",declareService.showBirthDay());
        modelAndView.addObject("moveList",declareService.showMove());
        modelAndView.addObject("starDayList",declareService.showStarDay());
        modelAndView.addObject("endDayList",declareService.showEndDay());
        return modelAndView;
    }
    @PostMapping("/edit")
    public String edit(@RequestParam int stt,Declare declare,RedirectAttributes redirectAttributes){
        declareService.edit(stt,declare);
        redirectAttributes.addFlashAttribute("mess","edit done");
        return "redirect:/list";
    }
}
