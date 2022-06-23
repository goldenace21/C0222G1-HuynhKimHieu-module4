package com.example.music.service;

import com.example.music.model.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();

    void save(Music music);

    Music findById(Integer id);
}
