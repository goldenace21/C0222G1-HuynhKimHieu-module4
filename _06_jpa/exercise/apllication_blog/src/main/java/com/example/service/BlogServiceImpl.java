package com.example.service;

import com.example.model.Blog;
import com.example.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository repository;

    @Override
    public List<Blog> findAllBlog() {
        return repository.findAllBlog();
    }

    @Override
    public void create(String title, String content, String dateCreate) {
        repository.create(title, content, dateCreate);
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

}
