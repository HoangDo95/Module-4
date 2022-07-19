package com.codegym.repository;

import com.codegym.model.Products;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    static List<Products> productList = new ArrayList<>();

    static {
        productList.add(new Products(1, "Iphone X", 100));
        productList.add(new Products(2, "Iphone 11", 100));
        productList.add(new Products(3, "Iphone 12", 100));
    }

    @Override
    public List<Products> showList() {
        return productList;
    }

    @Override
    public List<Products> findByName(String name) {
        List<Products> findName = new ArrayList<>();
        for (Products item : productList) {
            if (item.getName().contains(name)) {
                findName.add(item);
            }
        }
        return findName;
    }

    @Override
    public Products findById(int id) {
        return null;
    }

}
