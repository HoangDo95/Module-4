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
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/save")
    public String create(@RequestParam Blog blog) {
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/update")
    public String showFormUpdate(@RequestParam("id") int id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("blog") Blog blog) {
        blogService.update(blog);
        return "redirect:/blog";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        blogService.remove(id);
        return "redirect:list";
    }
}