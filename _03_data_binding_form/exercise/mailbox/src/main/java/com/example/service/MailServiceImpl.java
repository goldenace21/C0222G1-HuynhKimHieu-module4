package com.example.service;

import com.example.repository.IMailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailServiceImpl implements IMailService {

    @Autowired
    private IMailRepository iMailRepository;

    @Override
    public List<String> listLanguage() {
        return iMailRepository.listLanguage();
    }

    @Override
    public List<String> listPageSize() {
        return iMailRepository.listPageSize();
    }
}
