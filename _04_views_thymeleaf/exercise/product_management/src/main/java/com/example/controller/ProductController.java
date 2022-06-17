package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductSerive productSerive;

    @GetMapping("/")
    public String goListProduct(Model model) {
        model.addAttribute("product",new Product());
        model.addAttribute("products", productSerive.products());
        return "/list-product";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("product", new Product());
        return "/form-create";
    }

    @PostMapping("/create")
    public String create(Product product) {
        productSerive.addNew(product);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        productSerive.delete(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String goFormUpdate(@PathVariable String id, Model model) {
        model.addAttribute("product", productSerive.detail(id));
        return "/form-update";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productSerive.update(product);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable String id, Model model) {
        model.addAttribute("product", productSerive.detail(id));
        return "/detail-product";
    }

    @GetMapping("/search")
    public String search(Product product, Model model) {
        model.addAttribute("products", productSerive.searchByName(product.getName()));
        return "/list-product";
    }
}
