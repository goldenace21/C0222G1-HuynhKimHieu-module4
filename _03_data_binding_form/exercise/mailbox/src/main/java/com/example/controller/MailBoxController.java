package com.example.controller;

import com.example.model.Mail;
import com.example.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MailBoxController {

    @Autowired
    private IMailService iMailService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mail", new Mail());
        model.addAttribute("listLanguage", iMailService.listLanguage());
        model.addAttribute("listPageSize", iMailService.listPageSize());
        return "/home";
    }

    @PostMapping("/create")
    public String createMail(@ModelAttribute Mail mail, Model model) {
        model.addAttribute("languages", mail.getLanguages());
        model.addAttribute("pageSize", mail.getPageSize());
        model.addAttribute("spamFilter", mail.getSpamFilter());
        model.addAttribute("signature", mail.getSignature());
        return "/view";
    }
}