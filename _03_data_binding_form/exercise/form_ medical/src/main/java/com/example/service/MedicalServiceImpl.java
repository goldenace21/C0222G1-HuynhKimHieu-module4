package com.example.service;

import com.example.repository.IMedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicalServiceImpl implements IMedicalService {
    @Autowired
    IMedicalRepository iMedicalRepository;

    @Override
    public List<String> listBirthDay() {
        return iMedicalRepository.listBirthDay();
    }

    @Override
    public List<String> listGender() {
        return iMedicalRepository.listGender();
    }

    @Override
    public List<String> listTransport() {
        return iMedicalRepository.listTransport();
    }

    @Override
    public List<String> listStartDay() {
        return iMedicalRepository.listStartDay();
    }

    @Override
    public List<String> listEndDay() {
        return iMedicalRepository.listEndDay();
    }

    @Override
    public List<String> listStartMonth() {
        return iMedicalRepository.listStartMonth();
    }

    @Override
    public List<String> listEndMonth() {
        return iMedicalRepository.listEndMonth();
    }

    @Override
    public List<String> listStartYear() {
        return iMedicalRepository.listStartYear();
    }

    @Override
    public List<String> listEndYear() {
        return iMedicalRepository.listEndYear();
    }

    @Override
    public List<String> listNationality() {
        return iMedicalRepository.listNationality();
    }
}
