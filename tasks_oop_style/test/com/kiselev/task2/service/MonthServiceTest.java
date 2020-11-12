package com.kiselev.task2.service;

import com.kiselev.task2.entity.Month;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class MonthServiceTest {
    @Test
    public void daysAndYearTest() {
        Month month = new Month(11, 2016);
        int expectedDays = 30;
        MonthService service = new MonthService();
        int actualDays = service.howMuchDays(month);
        boolean actualYear = service.isLeap(month);
        assertSame(actualDays, expectedDays);
        assertSame(actualYear, true);
    }
}
