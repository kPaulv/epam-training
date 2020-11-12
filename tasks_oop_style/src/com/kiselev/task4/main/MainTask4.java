package com.kiselev.task4.main;

import com.kiselev.task4.entity.Numbers;
import com.kiselev.task4.report.NumbersReport;
import com.kiselev.task4.service.NumbersService;

public class MainTask4 {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(new int[]{5,8,333,54});
        NumbersService service = new NumbersService();
        boolean isTrue = service.twoEven(numbers);
        NumbersReport report = new NumbersReport();
        report.statementTruth(isTrue);
    }
}
