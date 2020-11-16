package com.kiselev.basketball.entity;

import java.util.Arrays;

public class Basket {
    private Ball[] balls;

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public Ball[] getBalls() {
        return balls;
    }

    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basket{");
        sb.append("balls=").append(Arrays.toString(balls));
        sb.append('}');
        return sb.toString();
    }
}
