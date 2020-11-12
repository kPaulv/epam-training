package com.kiselev.task3.entity;

public class Square {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("a=").append(a);
        sb.append('}');
        return sb.toString();
    }
}
