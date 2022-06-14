package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class VndController {
    @GetMapping("/78")
    public String hone() {
        return "/78";
    }

}
