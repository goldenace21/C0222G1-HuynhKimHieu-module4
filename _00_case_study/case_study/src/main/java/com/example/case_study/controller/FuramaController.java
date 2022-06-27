package com.example.case_study.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class FuramaController {

    @RequestMapping("/")
    public String goFurama(Model model) {
        return "/furama";
    }
}
