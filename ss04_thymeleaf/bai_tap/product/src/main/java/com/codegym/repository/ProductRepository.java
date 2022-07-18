package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    void create(Product product);

    Product findById(int id);

    void edit(int id, Product product);

    void delete(int id);

}
