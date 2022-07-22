package com.codegym.service;

import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CategoryService {
    Page<Category> findAll(Pageable pageable);

    void save(Category category);

    Optional<Category> findById(Integer id);

    void update(Category category);

    void remove(Integer id);

}
