package com.kiselev.task3.service;

import com.kiselev.task3.entity.Square;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertSame;

public class SquareServiceTest {
    @Test
    public void areaTest() {
        Square square = new Square(2);
        int expected = 2;
        int actual;
        SquareService service = new SquareService();
        actual = service.getInscribedArea(square);
        assertSame(actual,expected);
    }
}
