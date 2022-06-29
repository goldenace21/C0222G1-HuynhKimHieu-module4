package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAllBlog(Pageable pageable, int id);

    void create(String title, String content, String dateCreate);
    void save(Blog blog);

    void update(Integer id, String title, String content, String dateCreate);

    void deleteById(Integer id);

    Blog findById(Integer id);

    Page<Blog> findAllByCategory(Pageable pageable, String category);
}
