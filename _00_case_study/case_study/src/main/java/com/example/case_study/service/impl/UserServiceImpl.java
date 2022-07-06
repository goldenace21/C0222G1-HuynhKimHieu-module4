package com.example.case_study.service.impl;

import com.example.case_study.model.employee.User;
import com.example.case_study.repository.employee.UserRepository;
import com.example.case_study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
