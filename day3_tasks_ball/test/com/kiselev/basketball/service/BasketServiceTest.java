package com.kiselev.basketball.service;

import com.kiselev.basketball.entity.Ball;
import com.kiselev.basketball.entity.Basket;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

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
        String[] a = String.valueOf(expectedWeight).split("[.]");
        int expectedWeightInt = Integer.parseInt(a[0]);
        int expectedWeightFrac = Integer.parseInt(a[1]);
        a = String.valueOf(actualWeight).split("[.]");
        int actualWeightInt = Integer.parseInt(a[0]);
        int actualWeightFrac = Integer.parseInt(a[1]);
        assertSame(actualAmount, expectedAmount);
        assertSame(actualWeightInt, expectedWeightInt);
        assertSame(actualWeightFrac, expectedWeightFrac);
    }
}
