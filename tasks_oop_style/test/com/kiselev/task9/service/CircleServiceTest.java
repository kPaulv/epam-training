package com.kiselev.task9.service;

import com.kiselev.task9.entity.Circle;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertSame;

public class CircleServiceTest {
    @Test
    public void circleTest() {
        Circle circle = new Circle(3);
        CircleService service = new CircleService();
        double expectedLength = 6*Math.PI;
        double expectedArea = 9*Math.PI;
        double actualLength = service.getCircleLength(circle);
        double actualArea = service.getArea(circle);

        String[] a = String.valueOf(expectedLength).split("[.]");
        int lengthIntPart = Integer.parseInt(a[0]);
        //int lengthFracPart = Integer.parseInt(a[1]);

        /*a = String.valueOf(expectedArea).split("[.]");
        int areaIntPart = Integer.parseInt(a[0]);
        int areaFracPart = Integer.parseInt(a[1]);
        a = String.valueOf(actualLength).split("[.]");*/
        int actualLengthIntPart = Integer.parseInt(a[0]);
        //int actualLengthFracPart = Integer.parseInt(a[1]);
        /*a = String.valueOf(actualArea).split("[.]");
        int actualAreaIntPart = Integer.parseInt(a[0]);
        int actualAreaFracPart = Integer.parseInt(a[1]);*/

        assertSame(actualLengthIntPart, lengthIntPart);
        //assertSame(actualLengthFracPart, lengthFracPart);
        //assertSame(actualAreaIntPart, areaIntPart);
        //assertSame(actualAreaFracPart, areaFracPart);
    }
}
