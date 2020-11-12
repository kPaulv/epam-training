package com.kiselev.task9.service;

import com.kiselev.task9.entity.Circle;

public class CircleService {
    public double getCircleLength(Circle circle) {
        return 2*Math.PI*circle.getR();
    }

    public double getArea(Circle circle) {
        return Math.PI*Math.pow(circle.getR(), 2);
    }
}
