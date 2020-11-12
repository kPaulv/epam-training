package com.kiselev.task3.service;

import com.kiselev.task3.entity.Square;

public class SquareService {
    public int getArea(Square square) {
        return square.getA() * square.getA();
    }

    public int getInscribedArea(Square square) {
        return getArea(square)/2;
    }
}
