package com.example.blog.controller;

import com.example.blog.model.Category;
import com.example.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list-category")
    public String goListCategor(Model model) {
        model.addAttribute("categorys", categoryService.findAll());
        return "/list-category";
    }

    @GetMapping("/create-category")
    public String goFormCreate(Model model) {
        model.addAttribute("category", new Category());
        model.addAttribute("categorys", categoryService.findAll());
        return "/create-category";
    }

    @PostMapping("/create-category")
    public String create(Category category) {
        categoryService.save(category.getName());
        return "redirect:/list-category";
    }
}
