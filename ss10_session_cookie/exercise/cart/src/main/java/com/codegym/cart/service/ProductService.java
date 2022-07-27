package com.codegym.cart.service;

import com.codegym.cart.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Optional<Product> findById(int id);
}
