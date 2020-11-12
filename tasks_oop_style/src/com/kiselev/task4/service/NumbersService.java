package com.kiselev.task4.service;

import com.kiselev.task4.entity.Numbers;

public class NumbersService {
    public boolean twoEven(Numbers numbers) {
        int count = 0;
        for(int i = 0; i < numbers.getArray().length; i++) {
            if(numbers.getArray()[i] % 2 == 0) {
                count++;
            }
            if(count == 2) {
                return true;
            }
        }
        return false;
    }
}
