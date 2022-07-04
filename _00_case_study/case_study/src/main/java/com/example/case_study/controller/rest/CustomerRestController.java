package com.example.case_study.controller.rest;

import com.example.case_study.model.customer.Customer;
import com.example.case_study.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rest-customer")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<Page<Customer>> allCustomer(
            @RequestParam(name = "page", defaultValue = "0") int page) {
        Page<Customer> pageCustomer;
        pageCustomer = customerService.findAll(PageRequest.of(page, 5), "");
        return new ResponseEntity<>(pageCustomer, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Page<Customer>> findAllByName(@PathVariable(name = "name") String name,
                                                        @RequestParam(name = "page", defaultValue = "0") int page) {
        if(name == null) {
            name = "";
        }
        Page<Customer> pageCustomer;
        pageCustomer = customerService.findAllByNameContaining(PageRequest.of(page, 5), name);
        return new ResponseEntity<>(pageCustomer, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Customer> createNew(@Valid @RequestBody Customer customer) {
        customerService.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> HandleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) errors).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
