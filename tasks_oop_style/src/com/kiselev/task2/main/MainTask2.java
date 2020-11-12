package com.kiselev.task2.main;

import com.kiselev.task2.entity.Month;
import com.kiselev.task2.report.MonthReport;
import com.kiselev.task2.service.MonthService;

public class MainTask2 {
    public static void main(String[] args) {
        Month month = new Month(2,2009);
        MonthService service = new MonthService();
        int resDays = service.howMuchDays(month);
        boolean isLeap = service.isLeap(month);
        MonthReport report = new MonthReport();
        report.daysAndYear(resDays, isLeap);
    }

}
