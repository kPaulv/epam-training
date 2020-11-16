package com.kiselev.train.entity;

import java.util.Arrays;

public class Depot {
    private Train[] trains;

    public Depot(int size) {
        trains = new Train[size];
    }

    public Depot(Train[] trains) {
        this.trains = trains;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Depot{");
        sb.append("trains=").append(Arrays.toString(trains));
        sb.append('}');
        return sb.toString();
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }

    public Train[] getTrains() {
        return trains;
    }
}
