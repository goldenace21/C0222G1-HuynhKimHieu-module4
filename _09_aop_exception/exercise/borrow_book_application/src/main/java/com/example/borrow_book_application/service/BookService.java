package com.example.borrow_book_application.service;

import com.example.borrow_book_application.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    void updateUp(Integer id);
    String updateDown(Integer id);
    Book findById(Integer id);
}
