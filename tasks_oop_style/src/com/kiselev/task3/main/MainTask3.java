package com.kiselev.task3.main;

import com.kiselev.task3.entity.Square;
import com.kiselev.task3.report.SquareReport;
import com.kiselev.task3.service.SquareService;

public class MainTask3 {
    public static void main(String[] args) {
        Square square = new Square(12);
        SquareService service = new SquareService();
        int inscribedArea = service.getInscribedArea(square);
        SquareReport report = new SquareReport();
        report.showArea(inscribedArea);
    }
}
