package com.codegym.service;

import com.codegym.model.Products;

import java.util.List;

public interface ProductService {
    List<Products> showList();

    List<Products> findByName(String name);

    Products findById(int id);
}
