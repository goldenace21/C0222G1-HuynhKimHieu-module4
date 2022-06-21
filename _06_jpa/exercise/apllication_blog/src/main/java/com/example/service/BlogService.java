package com.example.service;

import com.example.model.Blog;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog> findAllBlog();

    void create(String title, String content, String dateCreate);

    void update(Integer id, String title, String content, String dateCreate);

    void deleteById(Integer id);

    Blog findById(Integer id);
}
