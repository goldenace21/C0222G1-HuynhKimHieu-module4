package com.example.repository;

import com.example.model.Music;

import java.util.List;

public interface MusicApplicationRepository {
    Music getByName(String name);

    List<Music> searchByName(String name);

    List<Music> getAll();

    void save(Music music);

    void update(Music music);

    void delete(Music music);
}
