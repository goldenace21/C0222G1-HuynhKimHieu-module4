package com.example.blog.controller.rest;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogRestController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public ResponseEntity<?> goListBlog() {
        List<Blog> blogs = blogService.findAllBlog();
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(blogs, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/{title}")
    public ResponseEntity<?> goListBlogByTitle(@PathVariable("title") String title) {
        List<Blog> blogs = blogService.findAllByTitle(title);
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(blogs, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }


}
