package com.codegym.case_study.controller;

import com.codegym.case_study.dto.CustomerDto;
import com.codegym.case_study.model.customer.Customer;
import com.codegym.case_study.service.customer.CustomerService;
import com.codegym.case_study.service.customer.CustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
                           @RequestParam Optional<String> name) {
        model.addAttribute("customerList", customerService.findAll(pageable, name.orElse("")));
        model.addAttribute("name", name.orElse(""));
        return "customer/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        model.addAttribute("customerDto", new CustomerDto());
        return "customer/create";
    }

    @PostMapping("/save")
    public String createCustomer(@Validated @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult, Model model) {
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        if (bindingResult.hasFieldErrors()) {
            return "/customer/create";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.save(customer);
            return "redirect:/customer";
        }
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model) {
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        model.addAttribute("customerDto", customerService.findById(id));
        return "customer/edit";
    }

    @PostMapping("/update")
    public String editCustomer(@Validated @ModelAttribute("customerDto") CustomerDto customerDto,BindingResult bindingResult, Model model ) {
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        if (bindingResult.hasFieldErrors()) {

            return "/customer/edit";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.save(customer);
            return "redirect:/customer";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        customerService.delete(id);
        return "redirect:/customer";
    }

}
