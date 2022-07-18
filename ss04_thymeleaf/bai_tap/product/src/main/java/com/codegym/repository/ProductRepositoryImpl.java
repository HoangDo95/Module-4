package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone 13", 100, "apple"));
        productList.add(new Product(2, "Iphone 12", 100, "apple"));
        productList.add(new Product(3, "Iphone 11", 100, "apple"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void create(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void edit(int id, Product product) {
        Product updateProduct = findById(id);
        updateProduct.setName(product.getName());
        updateProduct.setPrice((product.getPrice()));
        updateProduct.setProduction(product.getProduction());
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> findName = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                findName.add(product);
            }
        }
        return findName;
    }
}
