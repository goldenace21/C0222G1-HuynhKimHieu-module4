package com.example.borrow_book_application.repository;

import com.example.borrow_book_application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<com.example.borrow_book_application.model.User, Integer> {

    void deleteByCode(String code);

    User findByCode(String code);
}
