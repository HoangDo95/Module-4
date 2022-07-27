package com.codegym.cart.controller;

import com.codegym.cart.dto.CartDto;
import com.codegym.cart.dto.ProductDto;
import com.codegym.cart.model.Product;
import com.codegym.cart.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    ProductService productService;

    @GetMapping
    public ModelAndView showCart(@SessionAttribute(name = "cart",required = false)CartDto cartDto){
        ModelAndView modelAndView = new ModelAndView("cart","cart",cartDto);
        return modelAndView;
    }
    @GetMapping("delete")
    public String delete(@RequestParam int id, @SessionAttribute(name = "cart", required = false) CartDto cart) {
        Optional<Product> product = productService.findById(id);
        if (product.isPresent()) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(product.get(), productDto);
            cart.removeProduct(productDto);
        }
        return "redirect:/cart";
    }

    @GetMapping("decrement")
    public String decrement(@RequestParam int id, @SessionAttribute(name = "cart", required = false) CartDto cart) {
        Optional<Product> product = productService.findById(id);
        if (product.isPresent()) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(product.get(), productDto);
            cart.decrementProduct(productDto);
        }
        return "redirect:/cart";
    }
}
