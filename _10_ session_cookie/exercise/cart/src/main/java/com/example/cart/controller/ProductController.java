package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.model.Product;
import com.example.cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/cart/{id}")
    public String addToCart(@PathVariable("id") Integer id,
                            @ModelAttribute Cart cart,
                            @RequestParam("action") String action) {
        Optional<Product> product = productService.findById(id);
        if (!product.isPresent()) {
            return "/error";
        }
        if (action.equals("show")) {
            cart.addProduct(product.get());
            return "redirect:/cart-list";
        }
        cart.addProduct(product.get());
        return "redirect:/";
    }

    @RequestMapping("")
    public String goListProduct(Model model) {
        model.addAttribute("items",productService.findAll());
        return "list";
    }
}
