package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository repository;

    @Override
    public Page<Blog> findAllBlog(Pageable pageable, int id) {
        return repository.findAllBlog(pageable, id);
    }

    @Override
    public void create(String title, String content, String dateCreate) {
        repository.create(title, content, dateCreate);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void update(Integer id, String title, String content, String dateCreate) {
        repository.update(id, title, content, dateCreate);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Blog findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Page<Blog> findAllByCategory(Pageable pageable, String category) {
        return repository.findAllByCategory(pageable, category);
    }

}
