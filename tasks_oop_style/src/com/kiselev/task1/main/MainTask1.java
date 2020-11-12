package com.kiselev.task1.main;

import com.kiselev.task1.entity.Number;
import com.kiselev.task1.service.NumberService;
import com.kiselev.task1.report.NumberReport;

public class MainTask1 {
    public static void main(String[] args) {
        Number number = new Number(67);
        NumberService service = new NumberService();
        int res = service.findLastDigit(number);
        NumberReport report = new NumberReport();
        report.lastNumber(res);
    }
}
