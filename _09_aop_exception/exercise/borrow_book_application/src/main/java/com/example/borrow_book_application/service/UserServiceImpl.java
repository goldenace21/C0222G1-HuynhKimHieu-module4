package com.example.borrow_book_application.service;

import com.example.borrow_book_application.model.User;
import com.example.borrow_book_application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addNew(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByCode(String code) {
        return userRepository.findByCode(code);
    }

    @Override
    public void delete(String code) {
        userRepository.deleteByCode(code);
    }
}
