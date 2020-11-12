package com.kiselev.task4.service;

import com.kiselev.task4.entity.Numbers;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class NumbersServiceTest {
    @Test
    public void truthTest() {
        Numbers numbers = new Numbers(new int[]{2560, 3, 77, 88895});
        NumbersService service = new NumbersService();
        boolean actual = service.twoEven(numbers);
        assertSame(actual, false);
    }
}
