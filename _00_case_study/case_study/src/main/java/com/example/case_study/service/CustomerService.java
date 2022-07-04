package com.example.case_study.service;

import com.example.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable,String name);

    void edit(Customer customer);

    void deleteById(Integer id);

    void save(Customer customer);

    Page<Customer> findAllByNameContaining(Pageable pageable, String name);
}
