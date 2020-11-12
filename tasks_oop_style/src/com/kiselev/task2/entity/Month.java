package com.kiselev.task2.entity;

public class Month {
    private int monthNumber;
    private int year;

    public Month(int monthNumber, int year) {
        this.monthNumber = monthNumber;
        this.year = year;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public int getYear() {
        return year;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DateTime{");
        sb.append("month=").append(monthNumber);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
