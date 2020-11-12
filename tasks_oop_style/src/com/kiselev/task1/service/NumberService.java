package com.kiselev.task1.service;

import com.kiselev.task1.entity.Number;

public class NumberService {
    public int findLastDigit(Number number) {
        int lastDigit = number.getValue() % 10;

        return switch (lastDigit) {
            case 1, 9 -> 1;
            case 2, 8 -> 4;
            case 3, 7 -> 9;
            case 4, 6 -> 6;
            case 5 -> 5;
            default -> 0;
        };
    }

    public boolean isPerfect(Number number) {
        int sum = 0;
        for(int i = 1; i <= number.getValue()/2; i++) {
            if(number.getValue() % i == 0) {
                sum += i;
            }
        }
        return sum == number.getValue();
    }
}
