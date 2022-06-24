package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String goListProduct(@RequestParam(name = "page", defaultValue = "0") int page,
                                @RequestParam(name = "name", defaultValue = "") String name,
                                Model model) {
        Page<Product> products = productService.products(PageRequest.of(page, 2), name);
        model.addAttribute("products", products);
        model.addAttribute("product", new Product());
        model.addAttribute("namee", name);
        return "/list-product";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("product", new Product());
        return "/form-create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "/form-create";
        }
        productService.addNew(product);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(Integer id) {
        productService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String goFormUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/form-update";
    }

    @PostMapping("/update")
    public String update(Product product, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "/form-update";
        }
        productService.update(product);
        return "redirect:/";
    }
}
