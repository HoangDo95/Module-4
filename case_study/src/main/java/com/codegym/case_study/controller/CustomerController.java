package com.codegym.case_study.controller;

import com.codegym.case_study.model.customer.Customer;
import com.codegym.case_study.service.customer.CustomerService;
import com.codegym.case_study.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerTypeService customerTypeService;

    @GetMapping("")
    public String showList(@PageableDefault(value = 2) Pageable pageable, Model model,
                           @RequestParam Optional<String> name){
        model.addAttribute("customerList",customerService.findAll(pageable,name.orElse("")));
        model.addAttribute("name",name.orElse(""));
        return "customer/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("customerTypeList",customerTypeService.findAll());
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping("/save")
    public String createCustomer(@ModelAttribute ("customer") Customer customer){
        customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model){
        model.addAttribute("customerTypeList",customerTypeService.findAll());
        model.addAttribute("customer",customerService.findById(id));
        return "customer/edit";
    }

    @PostMapping("/update")
    public String editCustomer(@ModelAttribute("customer") Customer customer){
        customerService.update(customer);
        return "redirect:/customer";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        customerService.delete(id);
        return "redirect:/customer";
    }

}
