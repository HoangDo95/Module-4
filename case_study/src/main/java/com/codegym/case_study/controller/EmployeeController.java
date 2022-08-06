package com.codegym.case_study.controller;

import com.codegym.case_study.dto.EmployeeDto;
import com.codegym.case_study.model.employee.Division;
import com.codegym.case_study.model.employee.EducationDegree;
import com.codegym.case_study.model.employee.Employee;
import com.codegym.case_study.model.employee.Position;
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
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        model.addAttribute("employeeDto", new Employee());
        model.addAttribute("name", name.orElse(""));
        return "employee/list";
    }

//    @GetMapping("/create")
//    public String showCreate(Model model) {
//        model.addAttribute("positionList", positionService.findAll());
//        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
//        model.addAttribute("divisionList", divisionService.findAll());
//        model.addAttribute("employeeDto", new EmployeeDto());
//        return "employee/create";
//    }

    @PostMapping("/save")
    public String createEmployee(
                                     @RequestParam("name") String nameE,
                                     @RequestParam("birthDay") String birtDayE,
                                     @RequestParam("idCard") String idCardE,
                                     @RequestParam("salary") double salary,
                                     @RequestParam("phone") String phoneE,
                                     @RequestParam("email") String emailE,
                                     @RequestParam("address") String address,
                                     @RequestParam("position") Position position,
                                     @RequestParam("education") EducationDegree educationDegree,
                                     @RequestParam("division") Division division,
                                     Model model) {
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        Employee employee = new Employee(nameE,birtDayE,idCardE,salary,phoneE,emailE,address,position,educationDegree,division);

        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("update/{id}")
    public String showEdit(@PageableDefault(value = 2) Pageable pageable,
                           @PathVariable int id, Model model) {
        model.addAttribute("employeeList", employeeService.findAll(pageable, ""));
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        model.addAttribute("employeeDto", employeeService.findById(id));
        model.addAttribute("flag", 1);
        return "employee/list";
    }

    @PostMapping("/update")
    public String editEmployee(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        employeeService.delete(id);
        return "redirect:/employee";
    }

}
