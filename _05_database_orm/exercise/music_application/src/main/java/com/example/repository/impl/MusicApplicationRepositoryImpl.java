package com.example.repository.impl;

import com.example.model.Music;
import com.example.repository.BaseRepository;
import com.example.repository.MusicApplicationRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class MusicApplicationRepositoryImpl implements MusicApplicationRepository {

    @Override
    public Music getByName(String name) {
        return BaseRepository.entityManager.createQuery("select m from music m where m.name = ?1", Music.class).setParameter(1, name).getSingleResult();
    }

    @Override
    public List<Music> searchByName(String name) {
        return BaseRepository.entityManager.createQuery("select m from music m where m.name like ?1", Music.class).setParameter(1, "%" + name + "%").getResultList();
    }

    @Override
    public List<Music> getAll() {
        List<Music> musicList = BaseRepository.entityManager.createQuery("select m from music m", Music.class).getResultList();
        return musicList;
    }

    @Override
    public void save(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(music);
        entityTransaction.commit();
    }

    @Override
    public void update(Music music) {
        BaseRepository.entityManager.merge(music);
    }

    @Override
    public void delete(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(music);
        entityTransaction.commit();
    }
}
