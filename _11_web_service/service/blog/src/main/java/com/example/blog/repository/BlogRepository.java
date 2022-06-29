package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    // @Modifying cho method thay đổi data trong database

    @Query(value = "select * from blog where category_id = :id", nativeQuery = true)
    Page<Blog> findAllBlog(Pageable pageable, @Param("id") int id);

    @Modifying
    @Query(value = "insert into blog(title,content,date_create) value (:title, :content, :date_create)", nativeQuery = true)
    void create(@Param("title") String title, @Param("content") String content, @Param("date_create") String dateCreate);

    @Modifying
    @Query(value = "UPDATE blog set title = :title, content = :content, date_create = :date_create where id = :id", nativeQuery = true)
    void update(@Param("id") Integer id, @Param("title") String title, @Param("content") String content, @Param("date_create") String dateCreate);

    @Query(value = "select * from blog where id = :id", nativeQuery = true)
    Optional<Blog> findById(@Param("id") Integer id);

    @Modifying
    @Query(value = "UPDATE blog set delete_status = 1 where id = :id", nativeQuery = true)
    void deleteById(@Param("id") Integer id);

    Page<Blog> findAllByCategory(Pageable pageable, String category);
}