package com.example.borrow_book_application.repository;

import com.example.borrow_book_application.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Modifying
    @Query(value = "update book set quantity = quantity - 1 where id = :id", nativeQuery = true)
    public void updateDown(@Param("id") Integer id);

    @Modifying
    @Query(value = "update book set quantity = quantity + 1 where id = :id", nativeQuery = true)
    public void updateUp(@Param("id") Integer id);
}
