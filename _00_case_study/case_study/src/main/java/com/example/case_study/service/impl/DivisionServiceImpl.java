package com.example.case_study.service.impl;

import com.example.case_study.model.employee.Division;
import com.example.case_study.repository.employee.DivisionRepository;
import com.example.case_study.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {

    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
