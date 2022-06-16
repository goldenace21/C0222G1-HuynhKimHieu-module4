package com.example.service;

public interface ICalculatorService {
    String calculator(String number1, String number2, String operator);

    double addition(String number1, String number2);

    double subtraction(String number1, String number2);

    double multiplication(String number1, String number2);

    double division(String number1, String number2);
}
