package com.example.login_application.controller;

import com.example.login_application.model.User;
import com.example.login_application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String goFormCreate(Model model) {
        model.addAttribute("user", new User());
        return "/sig-up";
    }

    @PostMapping("/create")
    public String create(@Valid User user, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "/sig-up";
        }
        userService.save(user);
        model.addAttribute("msg", "sig up successfully");
        return "/home";
    }
}
