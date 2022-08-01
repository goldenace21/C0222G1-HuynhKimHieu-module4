package com.example.exam_m4.service;

import com.example.exam_m4.model.QuestionContent;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface QuestionContentService {

    void delete(Integer id);

    List<QuestionContent> findAll();

    QuestionContent save(QuestionContent questionContent);

    List<QuestionContent> findAllByTitleAndType(String title);
}
