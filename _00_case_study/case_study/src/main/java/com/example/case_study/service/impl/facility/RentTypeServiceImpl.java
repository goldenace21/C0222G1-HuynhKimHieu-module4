package com.example.case_study.service.impl.facility;

import com.example.case_study.model.facility.RentType;
import com.example.case_study.repository.facility.RentTypeRepository;
import com.example.case_study.service.facility.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    private RentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
