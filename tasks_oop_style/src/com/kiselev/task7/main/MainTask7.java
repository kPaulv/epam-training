package com.kiselev.task7.main;

import com.kiselev.task7.entity.Point;
import com.kiselev.task7.report.PointReport;
import com.kiselev.task7.service.PointService;

public class MainTask7 {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        Point point1 = new Point(9, 8);
        PointService service = new PointService();
        Point res = service.findClosestPoint(point1, point);
        PointReport report = new PointReport();
        report.closestPoint(res);
    }
}
