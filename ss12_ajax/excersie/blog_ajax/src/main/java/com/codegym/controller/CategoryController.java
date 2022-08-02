package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public String findAll(Pageable pageable,Model model) {
        Page<Category> categoryList = categoryService.findAll(pageable);
        model.addAttribute("categoryList", categoryList);
        return "listC";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        Category category = new Category();
        model.addAttribute("category", category);
        return "/createC";
    }

    @PostMapping("/save")
    public String create(@ModelAttribute("category") Category category) {
        categoryService.save(category);
        return "redirect:/category";
    }

    @GetMapping("/{id}/edit")
    public String showFormUpdate(@PathVariable("id") int id, Model model) {
        Optional<Category> category = categoryService.findById(id);
        model.addAttribute("category", category);
        return "/editC";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("category") Category category) {
        categoryService.update(category);
        return "redirect:/category";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        categoryService.remove(id);
        return "redirect:/category";
    }
}
