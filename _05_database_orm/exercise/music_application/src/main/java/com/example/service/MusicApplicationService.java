package com.example.service;

import com.example.model.Music;

import java.util.List;

public interface MusicApplicationService {
    List<Music> searchByName(String name);

    Music getByName(String name);

    List<Music> getAll();

    void save(Music music);

    void update(Music music);

    void delete(Music music);
}
