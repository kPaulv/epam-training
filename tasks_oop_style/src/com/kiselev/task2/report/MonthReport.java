package com.kiselev.task2.report;

public class MonthReport {
    public void daysAndYear(int days, boolean isLeap){
        String year;
        if(isLeap) {
            year = "leap year.";
        } else {
            year = "not leap year.";
        }
        System.out.println("Days in month: " + days + ", " + year);
    }
}
