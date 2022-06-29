package com.example.blog.controller.rest;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/category")
public class CategogyRestController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> goListCategory() {
        List<Category> cateList = categoryService.findAll();
        if (cateList.isEmpty()) {
            return new ResponseEntity<>(cateList, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cateList, HttpStatus.OK);
    }


    @GetMapping("/blogs/{id}")
    public ResponseEntity<?> goListBlogByCategory(@PathVariable Integer id) {
        Optional<Category> category = categoryService.findById(id);
        Set<Blog> blogs = category.get().getBlogs();
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(blogs, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
}
