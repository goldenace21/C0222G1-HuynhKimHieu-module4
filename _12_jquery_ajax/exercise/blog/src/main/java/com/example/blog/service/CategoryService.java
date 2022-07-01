package com.example.blog.service;

import com.example.blog.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> findAll();

    void save(String name);

    Optional<Category> findById(Integer id);
}
