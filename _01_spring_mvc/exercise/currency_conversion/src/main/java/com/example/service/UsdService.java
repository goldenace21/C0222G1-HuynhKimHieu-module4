package com.example.service;

public class UsdService {
    public String UsdToVnd(String usd) {
        String vnd = "0";
        if (usd.matches("^[\\d]*(.)?[\\d]*$")) {
            vnd = (Double.parseDouble(usd) * 23000) + "vnd";
        }
        return vnd;
    }
}
