package com.codegym.controller;

import com.codegym.dto.ProductDto;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("")
    public ModelAndView showList(@PageableDefault(value = 1, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("list", "productList", productService.findAll(pageable));
        return modelAndView;
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new ProductDto());
        return "/create";
    }

    @PostMapping("/save")
    public String createProduct(@Validated @ModelAttribute("product") ProductDto productDto, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        } else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto, product);
            productService.create(product);
            return "redirect:/product";
        }
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String editProduct(Product product) {
        productService.edit(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        productService.delete(id);
        return "redirect:/product";
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam String name, Model model) {
        model.addAttribute("productList", productService.findByName(name));
        return "list";
    }
}
