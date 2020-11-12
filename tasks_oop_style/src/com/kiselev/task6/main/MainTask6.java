package com.kiselev.task6.main;

import com.kiselev.task6.entity.Time;
import com.kiselev.task6.report.TimeReport;
import com.kiselev.task6.service.TimeService;

public class MainTask6 {
    public static void main(String[] args) {
        Time time = new Time(16054);
        TimeService service = new TimeService();
        int hours = service.getHoursAmount(time);
        int minutes = service.getMinutesAmount(time);
        int seconds = service.getSecondsAmount(time);
        TimeReport report = new TimeReport();
        report.allAmount(hours, minutes, seconds);
    }
}
