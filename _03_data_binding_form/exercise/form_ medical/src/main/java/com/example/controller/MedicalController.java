package com.example.controller;

import com.example.model.Medical;
import com.example.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MedicalController {

    @Autowired
    IMedicalService iMedicalService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("medical",new Medical());
        model.addAttribute("listBirthDay",iMedicalService.listBirthDay());
        model.addAttribute("listGender",iMedicalService.listGender());
        model.addAttribute("listTransport",iMedicalService.listTransport());
        model.addAttribute("listStartDay",iMedicalService.listStartDay());
        model.addAttribute("listEndDay",iMedicalService.listEndDay());
        model.addAttribute("listStartMonth",iMedicalService.listStartMonth());
        model.addAttribute("listEndMonth",iMedicalService.listEndMonth());
        model.addAttribute("listStartYear",iMedicalService.listStartYear());
        model.addAttribute("listEndYear",iMedicalService.listEndYear());
        model.addAttribute("listNationality",iMedicalService.listNationality());
        return "/form-medical";
    }
}
