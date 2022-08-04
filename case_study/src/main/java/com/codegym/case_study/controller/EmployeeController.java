package com.codegym.case_study.controller;

import com.codegym.case_study.dto.EmployeeDto;
import com.codegym.case_study.model.employee.Employee;
import com.codegym.case_study.service.employee.DivisionService;
import com.codegym.case_study.service.employee.EducationDegreeService;
import com.codegym.case_study.service.employee.EmployeeService;
import com.codegym.case_study.service.employee.PositionService;
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
    public String showList(@PageableDefault(value = 2) Pageable pageable, Model model,
                           @RequestParam Optional<String> name) {
        model.addAttribute("employeeList", employeeService.findAll(pageable, name.orElse("")));
        model.addAttribute("name", name.orElse(""));
        return "employee/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        model.addAttribute("employeeDto", new EmployeeDto());
        return "employee/create";
    }

    @PostMapping("/save")
    public String createCustomer(@Validated @ModelAttribute("employeeDto") EmployeeDto employeeDto, BindingResult bindingResult, Model model) {
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        if (bindingResult.hasFieldErrors()) {
            return "employee/create";
        }
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model) {
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        model.addAttribute("employeeDto", employeeService.findById(id));
        return "employee/edit";
    }

    @PostMapping("/update")
    public String editCustomer(@Validated @ModelAttribute("employeeDto") EmployeeDto employeeDto, BindingResult bindingResult, Model model) {
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        if (bindingResult.hasFieldErrors()) {
            return "employee/edit";
        }
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        employeeService.delete(id);
        return "redirect:/employee";
    }

}
