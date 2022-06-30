package com.example.blog.repository;

import java.util.List;

import com.example.blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findAll();

    @Modifying
    @Query(value = "insert into category(name) value (:name)", nativeQuery = true)
    void save(@Param("name") String name);
}
