package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog> findAll();

    Optional<Blog> findById(int id);

    List<Blog> find(int id);

}
