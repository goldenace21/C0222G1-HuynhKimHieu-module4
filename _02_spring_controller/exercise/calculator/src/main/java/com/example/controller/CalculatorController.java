package com.example.controller;

import com.example.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @Autowired
    ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @GetMapping("/calculator")
    public String calculator(String number1, String number2, String operator, Model model) {
        String result = iCalculatorService.caculator(number1, number2, operator);
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("result", result);
        model.addAttribute("operator", operator);
        return "/home";
    }
}
