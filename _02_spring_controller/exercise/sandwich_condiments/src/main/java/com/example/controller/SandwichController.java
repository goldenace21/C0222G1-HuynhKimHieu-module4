package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @GetMapping("/save")
    public String save(@RequestParam(value = "condiment", defaultValue = "empty list") String[] condiment, ModelMap modelMap) {
        modelMap.addAttribute("condiment", condiment);
        return "/result";
    }
}
