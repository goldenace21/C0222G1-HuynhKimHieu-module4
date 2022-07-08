package com.example.case_study.service.impl.customer;

import com.example.case_study.model.customer.Customer;
import com.example.case_study.repository.customer.CustomerRepository;
import com.example.case_study.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable, String name) {
        return customerRepository.findAll(pageable, name);
    }

    @Override
    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void save(Customer customer) {customerRepository.save(customer);}

    @Override
    public Optional<Customer> findById(Integer id) {
        return customerRepository.findById(id);
    }
}
