package com.codegym.case_study.controller;

import com.codegym.case_study.dto.ContractDto;
import com.codegym.case_study.model.contract.Contract;
import com.codegym.case_study.service.contract.AttachFacilityService;
import com.codegym.case_study.service.contract.ContractDetailService;
import com.codegym.case_study.service.contract.ContractService;
import com.codegym.case_study.service.customer.CustomerService;
import com.codegym.case_study.service.employee.EmployeeService;
import com.codegym.case_study.service.facility.FacilityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Pattern;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    ContractService contractService;

    @Autowired
    ContractDetailService contractDetailService;

    @Autowired
    CustomerService customerService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    FacilityService facilityService;

    @Autowired
    AttachFacilityService attachFacilityService;

    @GetMapping("")
    public String showList(@PageableDefault(value = 10) Pageable pageable, Model model) {
        model.addAttribute("contractList", contractService.findAll(pageable));
        model.addAttribute("contractDetailList", contractDetailService.findAll());
        model.addAttribute("customerList", customerService.findAllCustomer());
        model.addAttribute("employList", employeeService.findAllEmployee());
        model.addAttribute("facilityList", facilityService.findAllFacility());
        model.addAttribute("attachFacilityList", attachFacilityService.findAll());

        return "contract/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("contractDetailList", contractDetailService.findAll());
        model.addAttribute("customerList", customerService.findAllCustomer());
        model.addAttribute("employeeList", employeeService.findAllEmployee());
        model.addAttribute("facilityList", facilityService.findAllFacility());
        model.addAttribute("contractDto", new ContractDto());
        return "contract/create";
    }

    @PostMapping("/save")
    public String createContract(@Validated @ModelAttribute("contractDto") ContractDto contractDto, BindingResult bindingResult, Model model) {
        model.addAttribute("contractDetailList", contractDetailService.findAll());
        model.addAttribute("customerList", customerService.findAllCustomer());
        model.addAttribute("employeeList", employeeService.findAllEmployee());
        model.addAttribute("facilityList", facilityService.findAllFacility());
        if (bindingResult.hasFieldErrors()) {
            return "/contract/create";
        } else {
            Contract contract = new Contract();
            BeanUtils.copyProperties(contractDto, contract);
            contractService.save(contract);
            return "redirect:/contract";
        }
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model) {
        model.addAttribute("contractDetailList", contractDetailService.findAll());
        model.addAttribute("customerList", customerService.findAllCustomer());
        model.addAttribute("employeeList", employeeService.findAllEmployee());
        model.addAttribute("facilityList", facilityService.findAllFacility());
        model.addAttribute("contractDto", contractService.findById(id));
        return "contract/edit";
    }

    @PostMapping("/update")
    public String editContract(@Validated @ModelAttribute("contractDto") ContractDto contractDto, BindingResult bindingResult, Model model) {
        model.addAttribute("contractDetailList", contractDetailService.findAll());
        model.addAttribute("customerList", customerService.findAllCustomer());
        model.addAttribute("employeeList", employeeService.findAllEmployee());
        model.addAttribute("facilityList", facilityService.findAllFacility());
        if (bindingResult.hasFieldErrors()) {
            return "/contract/edit";
        } else {
            Contract contract = new Contract();
            BeanUtils.copyProperties(contractDto, contract);
            contractService.save(contract);
            return "redirect:/contract";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        contractService.delete(id);
        return "redirect:/contract";
    }

}
