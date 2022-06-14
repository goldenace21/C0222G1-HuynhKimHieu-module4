package com.example.repository;

import java.util.LinkedList;
import java.util.List;

public class DictionaryRepository {

    public static List<String> mapVietNam = new LinkedList<>();
    public static List<String> mapEnglish = new LinkedList<>();

    static {
        mapVietNam.add("cho");
        mapVietNam.add("meo");
        mapVietNam.add("chuot");
        mapVietNam.add("ho");
        mapVietNam.add("rong");
        mapEnglish.add("dog");
        mapEnglish.add("cat");
        mapEnglish.add("rat");
        mapEnglish.add("tiger");
        mapEnglish.add("dragon");
    }
}
