package com.example.case_study.service.impl.facility;

import com.example.case_study.model.facility.FacilityType;
import com.example.case_study.repository.facility.FacilityTypeRepository;
import com.example.case_study.service.facility.FacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeServiceImpl implements FacilityTypeService {

    @Autowired
    private FacilityTypeRepository facilityTypeRepository;

    @Override
    public List<FacilityType> findAll() {
        return facilityTypeRepository.findAll();
    }
}
