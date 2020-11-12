package com.kiselev.task7.service;

import com.kiselev.task7.entity.Point;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class PointServiceTest {
    @Test
    public void findClosesPointTest(){
        Point expected = new Point(1, 2);
        Point point1 = new Point(9, 8);
        PointService service = new PointService();
        Point actual = service.findClosestPoint(point1, expected);
        assertSame(actual, expected);
    }
}
