package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public String findAll(@PageableDefault(value = 2) Pageable pageable,Model model) {
        Page<Blog> blogList = blogService.findAll(pageable);
        model.addAttribute("blogList", blogList);
        Page<Category> categoryList = categoryService.findAll(pageable);
        model.addAttribute("categoryList", categoryList);
        return "/list";
    }

    @GetMapping("/create")
    public String showCreate(Pageable pageable,Model model) {
        Page<Category> categoryList = categoryService.findAll(pageable);
        model.addAttribute("categoryList", categoryList);
        Blog blog = new Blog();
        model.addAttribute("blog", blog);
        return "/create";
    }

    @PostMapping("/save")
    public String create(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String showFormUpdate(@PathVariable("id") int id,Pageable pageable, Model model) {
        Page<Category> categoryList = categoryService.findAll(pageable);
        model.addAttribute("categoryList", categoryList);
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("blog") Blog blog) {
        blogService.update(blog);
        return "redirect:/blog";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        blogService.remove(id);
        return "redirect:/blog";
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam String name, @PageableDefault(value = 2) Pageable pageable, Model model) {
        model.addAttribute("blogList", blogService.findByName(name,pageable));
        return "list";
    }
}