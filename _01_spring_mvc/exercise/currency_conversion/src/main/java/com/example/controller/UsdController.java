package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsdController {

    @GetMapping("/")
    public String hone() {
        return "/home";
    }

    @PostMapping("/home")
    public String hone2(String usd, Model model) {
        if (usd.equals("") || usd.equals("0") || usd.matches("^[\\D]*$")) {
            usd = "0";
            model.addAttribute("result", usd + "vnd");
            model.addAttribute("usd", usd);
        }
        else if (usd.matches("^[\\d]*(.)?[\\d]*$")) {
            model.addAttribute("result", Double.parseDouble(usd) * 23000+"vnd");
            model.addAttribute("usd", usd);
        }
        return "/home";
    }
}
