package com.example.case_study.service.customer;

import com.example.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable,String name);

    void deleteById(Integer id);

    void save(Customer customer);

    Optional<Customer> findById(Integer id);
}
