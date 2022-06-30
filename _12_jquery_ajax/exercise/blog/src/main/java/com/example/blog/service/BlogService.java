package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAllBlog(Pageable pageable, int id);

    void create(String title, String content, String dateCreate);

    void update(Integer id, String title, String content, String dateCreate);

    void deleteById(Integer id);

    Blog findById(Integer id);
}
