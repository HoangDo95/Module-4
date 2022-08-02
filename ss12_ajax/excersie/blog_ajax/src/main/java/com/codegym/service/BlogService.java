package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    void save(Blog blog);

    Blog findById(Integer id);

    void update(Blog blog);

    void remove(Integer id);

    Page<Blog> findByName(String name, Pageable pageable);
}
