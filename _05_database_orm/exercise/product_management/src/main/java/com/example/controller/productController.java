package com.example.controller;

import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class productController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String goListproduct(Model model) {
        model.addAttribute("products",productService.products());
        return "/list-product";
    }
}
