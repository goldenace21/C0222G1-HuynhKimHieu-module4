package com.example.music.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int")
    private Integer id;

    @Pattern(regexp = "^[\\w\\s]{1,800}$", message = "wrong format name music")
    private String name;

    @Pattern(regexp = "^[\\w\\s]{1,300}$", message = "wrong format singer")
    private String singer;

    @Pattern(regexp = "^[\\w,\\s]{1,1000}$", message = "wrong format category")
    private String category;

    public Music() {

    }

    public Music(Integer id, String name, String singer, String category) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.category = category;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
