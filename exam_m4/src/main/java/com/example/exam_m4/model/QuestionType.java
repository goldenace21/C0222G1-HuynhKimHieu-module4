package com.example.exam_m4.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "question_type")
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "questionType")
    @JsonBackReference("question")
    private Set<QuestionContent> questionContentSet;

    public QuestionType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<QuestionContent> getQuestionContentSet() {
        return questionContentSet;
    }

    public void setQuestionContentSet(Set<QuestionContent> questionContentSet) {
        this.questionContentSet = questionContentSet;
    }
}
