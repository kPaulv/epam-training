package com.kiselev.train.entity;

import java.time.LocalDateTime;

public class Train {
    private String destination;
    private int number;
    private LocalDateTime departureTime;
    private int commonSits;
    private int compartmentSits;
    private int reservedSits;
    private int luxSits;

    public Train() {
        destination = "";
        number = 0;
        departureTime = LocalDateTime.now();
        commonSits = 0;
        compartmentSits = 0;
        reservedSits = 0;
        luxSits = 0;
    }

    public Train(String destination, int number, LocalDateTime departureTime, int commonSits, int compartmentSits,
                 int reservedSits, int luxSits) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
        this.commonSits = commonSits;
        this.compartmentSits = compartmentSits;
        this.reservedSits = reservedSits;
        this.luxSits = luxSits;
    }

    public int getLuxSits() {
        return luxSits;
    }

    public int getReservedSits() {
        return reservedSits;
    }

    public int getCompartmentSits() {
        return compartmentSits;
    }

    public int getCommonSits() {
        return commonSits;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public void setLuxSits(int luxSits) {
        this.luxSits = luxSits;
    }

    public void setReservedSits(int reservedSits) {
        this.reservedSits = reservedSits;
    }

    public void setCompartmentSits(int compartmentSits) {
        this.compartmentSits = compartmentSits;
    }

    public void setCommonSits(int commonSits) {
        this.commonSits = commonSits;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Train{");
        sb.append("destination='").append(destination).append('\'');
        sb.append(", number=").append(number);
        sb.append(", departureTime='").append(departureTime).append('\'');
        sb.append(", commonSits=").append(commonSits);
        sb.append(", compartmentSits=").append(compartmentSits);
        sb.append(", reservedSits=").append(reservedSits);
        sb.append(", luxSits=").append(luxSits);
        sb.append('}');
        return sb.toString();
    }
}
