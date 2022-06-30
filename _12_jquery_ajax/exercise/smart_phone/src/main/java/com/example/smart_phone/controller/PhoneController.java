package com.example.smart_phone.controller;

import com.example.smart_phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("smartphones", phoneService.findAll());
        return "/list";
    }
}
