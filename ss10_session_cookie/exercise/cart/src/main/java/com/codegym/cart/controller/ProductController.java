package com.codegym.cart.controller;

import com.codegym.cart.dto.CartDto;
import com.codegym.cart.dto.ProductDto;
import com.codegym.cart.model.Product;
import com.codegym.cart.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@SessionAttributes("cart")
@Controller
@RequestMapping("/product")
public class ProductController {

    @ModelAttribute("cart")
    public CartDto initCart() {
        return new CartDto();
    }

    @Autowired
    ProductService productService;

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("productList",productService.findAll());
        return "/list";
    }

    @GetMapping("/detail/{id}")
    public ModelAndView showDetail(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("view","product",productService.findById(id).get());
        return modelAndView;

    }
    @GetMapping("/add/{id}")
    public String addToCard(@PathVariable int id,
                            @ModelAttribute("cart") CartDto cart) {
        Optional<Product> productDetail = productService.findById(id);
        if (productDetail.isPresent()) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productDetail.get(), productDto);
            cart.addProduct(productDto);
        }
        return "redirect:/cart";
    }
}
