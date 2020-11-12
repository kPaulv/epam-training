package com.kiselev.task1.service;


import com.kiselev.task1.entity.Number;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class NumberServiceTest {
    @Test
    public void findLastDigitTest() {
        Number number = new Number(269);
        int expected = 1;
        NumberService service = new NumberService();
        int actual = service.findLastDigit(number);
        assertSame(actual, expected);
    }

    @Test
    public void isPerfectTest() {
        Number number = new Number(55);
        NumberService service = new NumberService();
        boolean actual = service.isPerfect(number);
        AssertJUnit.assertSame(actual, false);
    }
}
