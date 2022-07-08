package com.example.case_study.controller;

import com.example.case_study.model.facility.Facility;
import com.example.case_study.service.facility.FacilityService;
import com.example.case_study.service.facility.FacilityTypeService;
import com.example.case_study.service.facility.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    private FacilityService facilityService;

    @Autowired
    private RentTypeService rentTypeService;

    @Autowired
    private FacilityTypeService facilityTypeService;

    @GetMapping
    public String goListFacility(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        model.addAttribute("facilitys",facilityService.findAll(PageRequest.of(page, 5)));
        model.addAttribute("rentTypes",rentTypeService.findAll());
        model.addAttribute("facilityTypes",facilityTypeService.findAll());
        model.addAttribute("facility", new Facility());
        return "/list-facility";
    }

    @PostMapping
    public String save(Facility facility) {
        facilityService.save(facility);
        return "redirect:/facility";
    }
}
