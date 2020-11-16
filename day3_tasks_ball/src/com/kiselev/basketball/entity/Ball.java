package com.kiselev.basketball.entity;

public class Ball {
    private String colour;
    private double weight;

    public Ball(String colour, double weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("colour='").append(colour).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
