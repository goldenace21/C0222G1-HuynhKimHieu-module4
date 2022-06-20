package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "music")
public class Music {
    @Id
    @Column(name = "music_name", columnDefinition = "varchar(200)")
    private String name;
    private  String singer;
    private  String category;
    private  String path;

    public Music() {
    }

    public Music(String name, String singer, String category, String path) {
        this.name = name;
        this.singer = singer;
        this.category = category;
        this.path = path;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
