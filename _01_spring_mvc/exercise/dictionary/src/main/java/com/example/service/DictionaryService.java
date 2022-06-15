package com.example.service;

import static com.example.repository.DictionaryRepository.mapEnglish;
import static com.example.repository.DictionaryRepository.mapVietNam;

public class DictionaryService implements IDictionaryService {

    public String translate(String word) {
        String result = "word does not exist";

        for (int i = 0; i< mapVietNam.size();i++) {
            if (word.equals(mapVietNam.get(i))) {
                result = mapEnglish.get(i);
                return result;
            } else if (word.equals(mapEnglish.get(i))) {
                result = mapVietNam.get(i);
                return result;
            }
        }

        return result;
    }

}
