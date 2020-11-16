package com.kiselev.basketball.main;

import com.kiselev.basketball.entity.Ball;
import com.kiselev.basketball.entity.Basket;
import com.kiselev.basketball.report.BasketReport;
import com.kiselev.basketball.service.BasketService;

import java.util.InputMismatchException;

public class BallMain {
    public static void main(String[] args) {
        try {
            BasketService service = new BasketService();
            Ball[] balls = service.ballsArray();
            Basket basket = new Basket(balls);
            double totalWeight = service.totalBallsWeight(basket);
            int blueBallsAmount = service.countBlueBalls(basket);
            BasketReport report = new BasketReport();
            report.showBasketResults(totalWeight, blueBallsAmount);
        } catch (InputMismatchException e) {
            System.out.println("Wrong input!");
        }
    }
}
