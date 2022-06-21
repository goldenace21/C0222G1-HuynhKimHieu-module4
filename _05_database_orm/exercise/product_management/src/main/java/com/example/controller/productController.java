package com.example.controller;

import com.example.model.Product;
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
    public String goListProduct(Model model) {
        model.addAttribute("products",productService.products());
        return "/list-product";
    }

    @RequestMapping("/")
    public String goFormCreate(Model model) {
        model.addAttribute("product",new Product());
        return "/form-create";
    }
}
