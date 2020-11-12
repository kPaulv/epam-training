package com.kiselev.task2.service;

import com.kiselev.task2.entity.Month;

public class MonthService {
    public boolean isLeap(Month month) {
        if(month.getYear() % 4 != 0) {
            return false;
        } else {
            if(month.getYear() % 100 == 0) {
                return month.getYear() % 400 == 0;
            } else {
                return true;
            }
        }
    }

    public int howMuchDays(Month month) {
        int days;
        switch (month.getMonthNumber()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if(isLeap(month)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 0;
                break;
        }

        return days;
    }
}
