package com.example.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepositoryImpl implements IMedicalRepository {
    private static List<String> listBirthDay = new ArrayList<>();
    private static List<String> listGender = new ArrayList<>();
    private static List<String> listTransport = new ArrayList<>();
    private static List<String> listStartDay = new ArrayList<>();
    private static List<String> listEndDay = new ArrayList<>();
    private static List<String> listStartMonth = new ArrayList<>();
    private static List<String> listEndMonth = new ArrayList<>();
    private static List<String> listStartYear = new ArrayList<>();
    private static List<String> listEndYear = new ArrayList<>();
    private static List<String> listNationality = new ArrayList<>();

    static {
        listBirthDay.add("2000");
        listBirthDay.add("2002");
        listBirthDay.add("2004");
        listBirthDay.add("2005");

        listGender.add("nam");
        listGender.add("nu");
        listGender.add("khac");

        listTransport.add("Tau bay");
        listTransport.add("Tau thuyen");
        listTransport.add("O to");
        listTransport.add("Khac");

        listStartDay.add("1");
        listStartDay.add("2");
        listStartDay.add("3");
        listStartDay.add("4");

        listEndDay.add("5");
        listEndDay.add("6");
        listEndDay.add("7");
        listEndDay.add("8");

        listStartMonth.add("1");
        listStartMonth.add("2");
        listStartMonth.add("3");
        listStartMonth.add("4");

        listEndMonth.add("5");
        listEndMonth.add("6");
        listEndMonth.add("7");
        listEndMonth.add("8");

        listStartYear.add("1990");
        listStartYear.add("1991");
        listStartYear.add("1992");
        listStartYear.add("1993");

        listEndYear.add("2000");
        listEndYear.add("2001");
        listEndYear.add("2002");
        listEndYear.add("2003");

        listNationality.add("vietnam");
        listNationality.add("korean");
        listNationality.add("japan");
        listNationality.add("china");
    }

    @Override
    public List<String> listBirthDay() {
        return listBirthDay;
    }

    @Override
    public List<String> listGender() {
        return listGender;
    }

    @Override
    public List<String> listTransport() {
        return listTransport;
    }

    @Override
    public List<String> listStartDay() {
        return listStartDay;
    }

    @Override
    public List<String> listEndDay() {
        return listEndDay;
    }

    @Override
    public List<String> listStartMonth() {
        return listStartMonth;
    }

    @Override
    public List<String> listEndMonth() {
        return listEndMonth;
    }

    @Override
    public List<String> listStartYear() {
        return listStartYear;
    }

    @Override
    public List<String> listEndYear() {
        return listEndYear;
    }

    @Override
    public List<String> listNationality() {
        return listNationality;
    }
}
