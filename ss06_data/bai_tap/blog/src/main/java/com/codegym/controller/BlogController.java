package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("")
    public String findAll(Model model) {
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogList", blogList);
        return "/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
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
    public String showFormUpdate(@PathVariable("id") int id, Model model) {
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
}