package com.example.service.impl;

import com.example.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements ICalculatorService {

    @Override
    public String calculator(String number1, String number2, String operator) {
        String result = "";
        try {
            switch (operator) {
                case "addition":
                    result += addition(number1, number2);
                    break;
                case "subtraction":
                    result += subtraction(number1, number2);
                    break;
                case "multiplication":
                    result += multiplication(number1, number2);
                    break;
                case "division":
                    result += division(number1, number2);
                    break;
            }
        } catch (NumberFormatException e) {
            result = "NumberFormatException";
        }
        return result;
    }

    @Override
    public double addition(String number1, String number2) {
        return Double.parseDouble(number1) + Double.parseDouble(number2);
    }

    @Override
    public double subtraction(String number1, String number2) {
        return Double.parseDouble(number1) - Double.parseDouble(number2);
    }

    @Override
    public double multiplication(String number1, String number2) {
        return Double.parseDouble(number1) * Double.parseDouble(number2);
    }

    @Override
    public double division(String number1, String number2) {
        return Double.parseDouble(number1) / Double.parseDouble(number2);
    }
}