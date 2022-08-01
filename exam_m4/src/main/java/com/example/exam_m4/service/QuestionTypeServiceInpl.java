package com.example.exam_m4.service;

import com.example.exam_m4.model.QuestionType;
import com.example.exam_m4.repository.QuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionTypeServiceInpl implements QuestionTypeService{

    @Autowired
    private QuestionTypeRepository questionTypeRepository;

    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }
}
