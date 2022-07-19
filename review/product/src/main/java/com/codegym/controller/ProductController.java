package com.codegym.controller;

import com.codegym.model.Products;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("")
    public String showList(Model model){
        List<Products> productList = productService.showList();
        model.addAttribute("productList",productList);
        return "/list";
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam String name, Model model) {
        List<Products> productList = productService.findByName(name);
        model.addAttribute("productList", productList);
        return "/list";
    }
}
