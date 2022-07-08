package com.example.case_study.service.impl.facility;

import com.example.case_study.model.customer.Customer;
import com.example.case_study.model.facility.Facility;
import com.example.case_study.repository.facility.FacilityRepository;
import com.example.case_study.service.facility.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements FacilityService {

    @Autowired
    private FacilityRepository facilityRepository;

    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return facilityRepository.findAll(pageable);
    }

    @Override
    public void save(Facility facility) {
        facilityRepository.save(facility);
    }
}
