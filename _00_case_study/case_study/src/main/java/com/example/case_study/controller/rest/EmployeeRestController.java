package com.example.case_study.controller.rest;

import com.example.case_study.model.employee.Employee;
import com.example.case_study.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/rest-employee")
public class EmployeeRestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public ResponseEntity<Page<Employee>> allEmployee(
            @RequestParam(name = "name", defaultValue = "") String name,
            @RequestParam(name = "page", defaultValue = "0") int page) {
        Page<Employee> pageEmployee;
        pageEmployee = employeeRepository.findAll(PageRequest.of(page, 5), name);
        return new ResponseEntity<>(pageEmployee, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable Integer id) {
       Employee employee;
       employee = employeeRepository.findById(id).get();
       return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> createNew(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
