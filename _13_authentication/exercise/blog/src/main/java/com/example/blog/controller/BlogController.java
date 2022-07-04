package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import com.example.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String goListBlog(Model model) {
        List<Blog> blogs = blogService.findAllBlog();
        model.addAttribute("blogs", blogs);
        model.addAttribute("categorys", categoryService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("categorys", categoryService.findAll());
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
        model.addAttribute("categorys", categoryService.findAll());
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

    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logoutSuccessfulPage";
    }
}
