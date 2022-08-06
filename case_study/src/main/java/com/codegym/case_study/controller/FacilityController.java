package com.codegym.case_study.controller;

import com.codegym.case_study.dto.FacilityDto;
import com.codegym.case_study.model.facility.Facility;
import com.codegym.case_study.service.FacilityService;
import com.codegym.case_study.service.FacilityTypeService;
import com.codegym.case_study.service.RentTypeService;
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
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    FacilityService facilityService;
    @Autowired
    FacilityTypeService facilityTypeService;
    @Autowired
    RentTypeService rentTypeService;

    @GetMapping("")
    public String showList(@PageableDefault(value = 2) Pageable pageable, Model model,
                           @RequestParam Optional<String> name){
        model.addAttribute("facilityList",facilityService.findAll(pageable,name.orElse("")));
        model.addAttribute("name",name.orElse(""));
        return "facility/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        model.addAttribute("rentTypeList",rentTypeService.findAll());
        model.addAttribute("facilityDto", new FacilityDto());
        return "facility/create";
    }

    @PostMapping("/save")
    public String createFacility(@Validated @ModelAttribute("facilityDto") FacilityDto facilityDto, BindingResult bindingResult, Model model){
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        model.addAttribute("rentTypeList",rentTypeService.findAll());
        if(bindingResult.hasFieldErrors()){
            return "facility/create";
        }
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto,facility);
        facilityService.save(facility);
        return "redirect:/facility";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model){
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        model.addAttribute("rentTypeList",rentTypeService.findAll());
        model.addAttribute("facility",facilityService.findById(id));
        return "facility/edit";
    }

    @PostMapping("/update")
    public String editFacility(@Validated @ModelAttribute("facilityDto") FacilityDto facilityDto, BindingResult bindingResult, Model model){
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        model.addAttribute("rentTypeList",rentTypeService.findAll());
        if(bindingResult.hasFieldErrors()){
            return "facility/edit";
        }
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto,facility);
        facilityService.update(facility);
        return "redirect:/facility";
    }

    @GetMapping("/delete")
    public String deleteFacility(@RequestParam int id) {
        facilityService.delete(id);
        return "redirect:/facility";
    }

}
