package com.example.service.impl;

import com.example.model.Music;
import com.example.repository.MusicApplicationRepository;
import com.example.service.MusicApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicApplicationServiceImpl implements MusicApplicationService {

    @Autowired
    private MusicApplicationRepository musicApplicationRepository;

    @Override
    public List<Music> searchByName(String name) {
        return musicApplicationRepository.searchByName(name);
    }

    @Override
    public Music getByName(String name) {
        return musicApplicationRepository.getByName(name);
    }

    @Override
    public List<Music> getAll() {
        return musicApplicationRepository.getAll();
    }

    @Override
    public void save(Music music) {
        musicApplicationRepository.save(music);
    }

    @Override
    public void update(Music music) {
        musicApplicationRepository.update(music);
    }

    @Override
    public void delete(Music music) {
        musicApplicationRepository.delete(music);
    }
}
