package com.kiselev.task9.main;

import com.kiselev.task9.entity.Circle;
import com.kiselev.task9.report.CircleReport;
import com.kiselev.task9.service.CircleService;

public class MainTask9 {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        CircleService service = new CircleService();
        double length = service.getCircleLength(circle);
        double area = service.getArea(circle);
        CircleReport report = new CircleReport();
        report.lengthAndArea(length, area);
    }
}
