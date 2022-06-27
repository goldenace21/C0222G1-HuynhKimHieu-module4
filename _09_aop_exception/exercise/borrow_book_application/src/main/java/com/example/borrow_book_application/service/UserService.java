package com.example.borrow_book_application.service;

import com.example.borrow_book_application.model.User;

public interface UserService {
    void addNew(User user);

    User findByCode(String code);

    void delete(String code);
}
