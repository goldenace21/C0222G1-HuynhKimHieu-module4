package com.example.controller;

import com.example.service.DictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    DictionaryService dictionaryService = new DictionaryService();

    @GetMapping("/")
    public String home() {
        return "/index";
    }

    @PostMapping ("/dictionary")
    public String translate(String word, Model model) {
        String result = dictionaryService.translate(word);
        model.addAttribute("result", result);
        model.addAttribute("word", word);
        return "/index";
    }
}
