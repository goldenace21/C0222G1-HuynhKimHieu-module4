package com.example.controller;

import com.example.service.UsdServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsdController {

    UsdServiceImpl usdService = new UsdServiceImpl();

    @GetMapping("/")
    public String hone() {
        return "/home";
    }

    @PostMapping("/home")
    public String hone2(String usd, Model model) {
        String vnd = usdService.UsdToVnd(usd);
        model.addAttribute("result", vnd);
        model.addAttribute("usd", usd);
        return "/home";
    }
}
