package com.example.exam_m4.service;

import com.example.exam_m4.model.QuestionContent;
import com.example.exam_m4.repository.QuestionContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionContentServiceImpl implements QuestionContentService{

    @Autowired
    private QuestionContentRepository questionContentRepository;

    @Override
    public void delete(Integer id) {
        questionContentRepository.delete(id);
    }

    @Override
    public List<QuestionContent> findAll() {
        return questionContentRepository.findAll();
    }

    @Override
    public QuestionContent save(QuestionContent questionContent) {
        return questionContentRepository.save(questionContent);
    }

    @Override
    public List<QuestionContent> findAllByTitleAndType(String title) {
        return questionContentRepository.findAllByTitleAndType(title);
    }
}
