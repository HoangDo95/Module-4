package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    void create(Product product);

    Optional<Product> findById(int id);

    void edit(Product product);

    void delete(int id);

//    void view(Product product);

    List<Product> findByName(String name);
}
