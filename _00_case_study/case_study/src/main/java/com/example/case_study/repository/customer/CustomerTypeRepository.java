package com.example.case_study.repository.customer;

import com.example.case_study.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
