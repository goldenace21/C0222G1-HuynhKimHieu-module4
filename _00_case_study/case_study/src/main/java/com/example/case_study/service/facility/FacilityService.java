package com.example.case_study.service.facility;

import com.example.case_study.model.customer.Customer;
import com.example.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FacilityService {
    Page<Facility> findAll(Pageable pageable);
    void save(Facility facility);
}
