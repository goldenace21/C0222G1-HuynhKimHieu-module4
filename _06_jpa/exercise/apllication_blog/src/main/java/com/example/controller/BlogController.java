package com.example.controller;

import com.example.model.Blog;
import com.example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/")
    public String goListBlog(Model model) {
        model.addAttribute("blogs", blogService.findAllBlog());
        return "/list";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/create")
    public String create(Blog blog) {
        blogService.create(blog.getTitle(), blog.getContent(), blog.getDateCreate());
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String goFormUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/update";
    }

    @PostMapping("update")
    public String update(Blog blog) {
        blogService.update(blog.getId(), blog.getTitle(), blog.getContent(), blog.dateCreate);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        blogService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/content/{id}")
    public String goContent(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/content";
    }
}
