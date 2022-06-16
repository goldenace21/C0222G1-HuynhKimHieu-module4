package com.example.repository;

import java.util.List;

public interface IMedicalRepository {
    List<String> listBirthDay();
    List<String> listGender();
    List<String> listTransport();
    List<String> listStartDay();
    List<String> listEndDay();
    List<String> listStartMonth();
    List<String> listEndMonth();
    List<String> listStartYear();
    List<String> listEndYear();
    List<String> listNationality();
}
