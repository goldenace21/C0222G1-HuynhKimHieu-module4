package com.example.case_study.controller;

import com.example.case_study.model.customer.Customer;
import com.example.case_study.model.employee.Division;
import com.example.case_study.model.employee.Employee;
import com.example.case_study.repository.employee.DivisionRepository;
import com.example.case_study.repository.employee.EducationDegreeRepository;
import com.example.case_study.repository.employee.PositionRepository;
import com.example.case_study.repository.employee.UserRepository;
import com.example.case_study.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PositionRepository positionRepository;

    @Autowired
    private EducationDegreeRepository educationDegreeRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public String goList(@RequestParam(name = "page", defaultValue = "0") int page,
                         @RequestParam(name = "name", defaultValue = "") String name,
                         Model model) {
        Page<Employee> employees = employeeService.findAll(PageRequest.of(page, 5), name);
        model.addAttribute("positions", positionRepository.findAll());
        model.addAttribute("educationDegrees", educationDegreeRepository.findAll());
        model.addAttribute("divisions", divisionRepository.findAll());
        model.addAttribute("users", userRepository.findAll());
        return "/list-employee";
    }
}
