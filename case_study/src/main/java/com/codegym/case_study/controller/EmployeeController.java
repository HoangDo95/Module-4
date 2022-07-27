package com.codegym.case_study.controller;

import com.codegym.case_study.model.employee.Employee;
import com.codegym.case_study.service.employee.DivisionService;
import com.codegym.case_study.service.employee.EducationDegreeService;
import com.codegym.case_study.service.employee.EmployeeService;
import com.codegym.case_study.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    PositionService positionService;

    @Autowired
    DivisionService divisionService;

    @Autowired
    EducationDegreeService educationDegreeService;

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("employeeList",employeeService.findAll());
        model.addAttribute("positionList",positionService.findAll());
        model.addAttribute("educationDegreeList",educationDegreeService.findAll());
        model.addAttribute("divisionList",divisionService.findAll());
        return "employee/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("positionList",positionService.findAll());
        model.addAttribute("educationDegreeList",educationDegreeService.findAll());
        model.addAttribute("divisionList",divisionService.findAll());
        model.addAttribute("employee", new Employee());
        return "employee/create";
    }

    @PostMapping("/save")
    public String createCustomer(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        return "redirect:/employee";
    }



}
