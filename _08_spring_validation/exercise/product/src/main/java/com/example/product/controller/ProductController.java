package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String goListProduct(Model model) {
        model.addAttribute("product",new Product());
        model.addAttribute("products", productService.products());
        return "/list-product";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("product", new Product());
        return "/form-create";
    }

    @PostMapping("/create")
    public String create(Product product) {
        productService.addNew(product);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        productService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String goFormUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/form-update";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product);
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(Product product, Model model) {
        model.addAttribute("products", productService.findAllByName(product.getName()));
        return "/list-product";
    }
}
