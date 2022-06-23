package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String goListProduct(Model model) {
        model.addAttribute("products",productService.products());
        return "/list-product";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("product",new Product());
        return "/form-create";
    }

    @PostMapping("/create")
    public String create(Product product) {
        productService.addNew(product);
        return "redirect:/";
    }
}
