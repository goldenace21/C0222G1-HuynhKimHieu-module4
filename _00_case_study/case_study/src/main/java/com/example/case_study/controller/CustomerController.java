package com.example.case_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/list-customer")
    public String goList(Model model) {
        return "/customer/list-customer";
    }
}
