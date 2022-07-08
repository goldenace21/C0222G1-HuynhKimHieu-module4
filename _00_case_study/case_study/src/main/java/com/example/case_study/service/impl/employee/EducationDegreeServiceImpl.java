package com.example.case_study.service.impl.employee;

import com.example.case_study.model.employee.EducationDegree;
import com.example.case_study.repository.employee.EducationDegreeRepository;
import com.example.case_study.service.employee.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {

    @Autowired
    private EducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
