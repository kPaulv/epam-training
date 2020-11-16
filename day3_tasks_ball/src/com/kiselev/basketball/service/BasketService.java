package com.kiselev.basketball.service;

import com.kiselev.basketball.entity.Ball;
import com.kiselev.basketball.entity.Basket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasketService {
    public Ball[] ballsArray() throws InputMismatchException {
        int n = 0;
        Ball[] balls;
        System.out.println("Enter balls amount: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        balls = new Ball[n];
        System.out.println("Enter balls' colour and weight: ");
        String colour;
        double weight;
        Ball tempBall = new Ball("", 0);
        for (int i = 0; i < n; i++) {
            colour = sc.next();
            weight = sc.nextDouble();
            tempBall.setColour(colour);
            tempBall.setWeight(weight);
            balls[i] = tempBall;
        }
        sc.close();
        return balls;
    }

    public double totalBallsWeight(Basket basket) {
        double totalWeight = 0;
        Ball[] balls = basket.getBalls();
        for (int i = 0; i < balls.length; i++) {
            totalWeight += balls[i].getWeight();
        }
        return totalWeight;
    }

    public int countBlueBalls(Basket basket) {
        String colour = "blue";
        int blueBallsAmount = 0;
        Ball[] balls = basket.getBalls();
        for(Ball ball : balls) {
            if(ball.getColour().equalsIgnoreCase(colour)) {
                blueBallsAmount++;
            }
        }
        return blueBallsAmount;
    }
}
