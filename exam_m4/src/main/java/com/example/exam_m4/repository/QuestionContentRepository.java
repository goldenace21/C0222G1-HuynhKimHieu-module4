package com.example.exam_m4.repository;

import com.example.exam_m4.model.QuestionContent;
import com.example.exam_m4.service.QuestionContentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface QuestionContentRepository extends JpaRepository<QuestionContent, Integer> {

    @Query(value = "select * from question_content where status_delete = 0", nativeQuery = true)
    List<QuestionContent> findAll();

    QuestionContent save(QuestionContent questionContent);

    @Query(value = "select * from question_content where status_delete = 0 and title like %:title%", nativeQuery = true)
    List<QuestionContent> findAllByTitleAndType(@Param("title") String title);

    @Query(value = "update question_content set status_delete = 1 where id = :id", nativeQuery = true)
    void delete(@Param("id") Integer id);
}