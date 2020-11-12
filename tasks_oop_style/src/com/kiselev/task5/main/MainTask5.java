package com.kiselev.task5.main;

import com.kiselev.task1.entity.Number;
import com.kiselev.task1.service.NumberService;
import com.kiselev.task5.report.ReportTask5;

public class MainTask5 {
    public static void main(String[] args) {
        Number number = new Number(496);
        NumberService service = new NumberService();
        boolean isPerfect = service.isPerfect(number);
        ReportTask5 report = new ReportTask5();
        report.statementTruth(isPerfect);
    }
}
