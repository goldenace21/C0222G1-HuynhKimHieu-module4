package com.example.blog.controller.rest;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/blog")
public class BlogRestController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public ResponseEntity<?> goListBlog(@RequestParam(name = "page", defaultValue = "0") int page,
                                        @RequestParam(name = "cate", defaultValue = "1") int cate) {
        Sort sort = Sort.by("date_create").ascending();
        Page<Blog> blogs = blogService.findAllBlog(PageRequest.of(page, 2, sort), cate);
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(blogs, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> goListBlogById(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(blog, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Blog> create(@RequestBody Blog blog) {
        blogService.create(blog.getTitle(), blog.getContent(), blog.getDateCreate());
        return new ResponseEntity<>(blog, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Blog blog) {
        Optional<Blog> blogOptional = Optional.ofNullable(blogService.findById(id));
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blog.setId(blogOptional.get().getId());
        blogService.save(blog);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> delete(@PathVariable Integer id) {
        Optional<Blog> blogOptional = Optional.ofNullable(blogService.findById(id));
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.deleteById(id);
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.NO_CONTENT);
    }
}
