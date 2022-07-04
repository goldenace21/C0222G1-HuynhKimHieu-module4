package com.example.case_study.controller;

import com.example.case_study.model.customer.Customer;
import com.example.case_study.service.CustomerService;
import com.example.case_study.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @GetMapping("")
    public String goList(@RequestParam(name = "page", defaultValue = "0") int page,
                         @RequestParam(name = "name", defaultValue = "") String name,
                         Model model) {
        Page<Customer> customers = customerService.findAll(PageRequest.of(page, 5), name);
        model.addAttribute("customers", customers);
        model.addAttribute("customerTypes", customerTypeService.findAll());
        model.addAttribute("name", name);
        return "/customer/list-customer";
    }
}
