package com.codegym.repository;

import com.codegym.model.Products;

import java.util.List;

public interface ProductRepository {
    List<Products> showList();

    List<Products> findByName(String name);

    Products findById(int id);

}
