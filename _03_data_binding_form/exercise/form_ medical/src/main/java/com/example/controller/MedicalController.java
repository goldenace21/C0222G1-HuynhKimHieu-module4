package com.example.controller;

import com.example.model.Medical;
import com.example.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicalController {

    @Autowired
    IMedicalService iMedicalService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("medical", new Medical());
        model.addAttribute("listBirthDay", iMedicalService.listBirthDay());
        model.addAttribute("listGender", iMedicalService.listGender());
        model.addAttribute("listTransport", iMedicalService.listTransport());
        model.addAttribute("listStartDay", iMedicalService.listStartDay());
        model.addAttribute("listEndDay", iMedicalService.listEndDay());
        model.addAttribute("listStartMonth", iMedicalService.listStartMonth());
        model.addAttribute("listEndMonth", iMedicalService.listEndMonth());
        model.addAttribute("listStartYear", iMedicalService.listStartYear());
        model.addAttribute("listEndYear", iMedicalService.listEndYear());
        model.addAttribute("listNationality", iMedicalService.listNationality());
        return "/form-medical";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Medical medical, Model model) {
        model.addAttribute("name", medical.getName());
        model.addAttribute("birthday", medical.getBirthday());
        model.addAttribute("gender", medical.getGender());
        model.addAttribute("nationality", medical.getNationality());
        model.addAttribute("idNumber", medical.getIdNumber());
        model.addAttribute("transport", medical.getTransport());
        model.addAttribute("idTransport", medical.getIdTransport());
        model.addAttribute("seats", medical.getSeats());
        model.addAttribute("startDay", medical.getStartDay());
        model.addAttribute("endDay", medical.getEndDay());
        model.addAttribute("startMonth", medical.getStartMonth());
        model.addAttribute("endMonth", medical.getEndMonth());
        model.addAttribute("startYear", medical.getStartYear());
        model.addAttribute("endYear", medical.getEndYear());
        model.addAttribute("historyMove", medical.getHistoryMove());
        return "/view";
    }
}
