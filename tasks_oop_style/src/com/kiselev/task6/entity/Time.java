package com.kiselev.task6.entity;

public class Time {
    private int seconds;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Time{");
        sb.append("seconds=").append(seconds);
        sb.append('}');
        return sb.toString();
    }
}
