package com.example.music.repository;

import com.example.music.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface MusicRepository extends JpaRepository<Music, Integer> {
}
