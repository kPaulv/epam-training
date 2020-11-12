package com.kiselev.task8.entity;

public class Variable {
    private double x;

    public Variable(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Variable{");
        sb.append("x=").append(x);
        sb.append('}');
        return sb.toString();
    }
}
