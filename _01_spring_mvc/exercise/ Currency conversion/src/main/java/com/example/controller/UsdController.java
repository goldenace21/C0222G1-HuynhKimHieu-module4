package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {

    @GetMapping("/home")
    public String hone() {
        return "/home";
    }


    @PostMapping("/home")
    public String hone2(Double usd, Model model) {
        model.addAttribute("result", usd * 23000);
        return "/home";
    }
}
