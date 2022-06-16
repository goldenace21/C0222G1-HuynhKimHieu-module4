package com.example.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepository implements IMailRepository {
    private static List<String> listLanguage = new ArrayList<>();
    private static List<String> listPageSize = new ArrayList<>();

    static {
        listLanguage.add("English");
        listLanguage.add("Vietnamese");
        listLanguage.add("Japanese");
        listLanguage.add("Chinese");

        listPageSize.add("5");
        listPageSize.add("10");
        listPageSize.add("15");
        listPageSize.add("20");
        listPageSize.add("25");
        listPageSize.add("50");
        listPageSize.add("100");
    }


    @Override
    public List<String> listLanguage() {
        return listLanguage;
    }

    @Override
    public List<String> listPageSize() {
        return listPageSize;
    }
}