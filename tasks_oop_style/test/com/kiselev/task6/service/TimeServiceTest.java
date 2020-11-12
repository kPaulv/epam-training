package com.kiselev.task6.service;

import com.kiselev.task6.entity.Time;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertSame;

public class TimeServiceTest {
    @Test
    public void timeTest() {
        Time time = new Time(65029);
        int expectedHours = 18;
        int expectedMinutes = 3;
        int expectedSeconds = 49;
        TimeService service = new TimeService();
        int actualHours = service.getHoursAmount(time);
        int actualMinutes = service.getMinutesAmount(time);
        int actualSeconds = service.getSecondsAmount(time);
        assertSame(actualHours, expectedHours);
        assertSame(actualMinutes, expectedMinutes);
        assertSame(actualSeconds, expectedSeconds);
    }
}
