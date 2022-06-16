package com.example.controller;

import com.example.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculatorController {

    @Autowired
    ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @GetMapping("/calculator")
    public String calculator(String number1, String number2, String operator, RedirectAttributes redirectAttributes) {
        String result = iCalculatorService.calculator(number1, number2, operator);
        redirectAttributes.addFlashAttribute("number1", number1);
        redirectAttributes.addFlashAttribute("number2", number2);
        redirectAttributes.addFlashAttribute("result", result);
        redirectAttributes.addFlashAttribute("operator", operator);
        return "redirect:/";
    }
}
