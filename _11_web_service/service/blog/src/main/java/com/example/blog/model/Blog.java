package com.example.blog.model;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int")
    private Integer id;
    private String title;
    @Column(columnDefinition = "text")
    private String content;
    @Column(name = "date_create", columnDefinition = "date")
    public String dateCreate;
    @Column(name = "delete_status", columnDefinition = "int default 0")
    private Integer deleteStatus;
    @ManyToOne(targetEntity = Category.class)
    private Category category;

    public Blog() {

    }

    public Blog(Integer id, String title, String content, String dateCreate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dateCreate = dateCreate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
