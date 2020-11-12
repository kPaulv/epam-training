package com.kiselev.task8.service;

import com.kiselev.task8.entity.Variable;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertSame;

public class VariableServiceTest {
    @Test
    public void functionTest() {
        Variable variable = new Variable(2);
        VariableService service = new VariableService();
        double expected = 0.5;
        double actual = service.function(variable);
        String[] a = String.valueOf(expected).split("[.]");
        int expectedIntPart = Integer.parseInt(a[0]);
        int expectedFracPart = Integer.parseInt(a[1]);
        a = String.valueOf(actual).split("[.]");
        int actualIntPart = Integer.parseInt(a[0]);
        int actualFracPart = Integer.parseInt(a[1]);
        assertSame(actualIntPart, expectedIntPart);
        assertSame(actualFracPart, expectedFracPart);
    }
}
