package com.example.repository;

import com.example.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    // @Modifying cho method thay đổi data trong database

    @Query(value = "select * from blog", nativeQuery = true)
    List<Blog> findAllBlog();

    @Modifying
    @Query(value = "insert into blog(title,content,date_create) value (:title, :content, :date_create)", nativeQuery = true)
    void create(@Param("title") String title, @Param("content") String content, @Param("date_create") String dateCreate);

    @Modifying
    @Query(value = "UPDATE blog set title = :title, content = :content, date_create = :date_create where id = :id", nativeQuery = true)
    void update(@Param("id") Integer id, @Param("title") String title, @Param("content") String content, @Param("date_create") String dateCreate);

    @Query(value = "select * from blog where id = :id", nativeQuery = true)
    Optional<Blog> findById(@Param("id") Integer id);
}