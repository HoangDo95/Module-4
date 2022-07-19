package com.codegym.service;

import com.codegym.model.Products;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Products> showList() {
        return productRepository.showList();
    }

    @Override
    public List<Products> findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Products findById(int id) {
        return null;
    }
}
