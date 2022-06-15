package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {
    @Override
    public double calculator(double number1, double number2, char check) {
        switch (check) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    throw new RuntimeException("khong chia duoc");
                }
            default:
                throw new IllegalStateException("chon sai");
        }
    }
}
