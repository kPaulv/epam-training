package com.kiselev.basketball.service;

import com.kiselev.basketball.entity.Ball;
import com.kiselev.basketball.entity.Basket;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;
import static org.testng.AssertJUnit.assertEquals;

public class BasketServiceTest {
    @Test
    public void ballTest() {
        Ball[] balls = new Ball[]{new Ball("red", 12.5), new Ball("blue", 4.3),
                                  new Ball("green", 1.6), new Ball("blue", 2.4)};
        Basket basket = new Basket(balls);
        int expectedAmount = 2;
        double expectedWeight = 20.8;
        BasketService service = new BasketService();
        int actualAmount = service.countBlueBalls(basket);
        double actualWeight = service.totalBallsWeight(basket);
        assertSame(actualAmount, expectedAmount);
        assertEquals(actualWeight, expectedWeight);
    }
}
