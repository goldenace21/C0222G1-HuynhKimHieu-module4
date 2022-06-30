package com.example.smart_phone.service;

import com.example.smart_phone.model.Phone;

import java.util.Optional;

public interface PhoneService {
    Iterable<Phone> findAll();

    Optional<Phone> findById(Long id);

    Phone save(Phone phone);

    void remove(Long id);
}
