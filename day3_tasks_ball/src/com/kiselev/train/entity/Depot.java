package com.kiselev.train.entity;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Depot {
    private Train[] trains;

    public Depot(int size) {
        trains = new Train[size];
    }

    public Depot(Train[] trains) {
        this.trains = trains;
    }

    public Train[] similarDestination(String destination) {
        Train[] similarDestTrains = new Train[trains.length];
        int count = 0;
        for(int i = 0; i < trains.length; i++) {
            if(trains[i].getDestination().equalsIgnoreCase(destination)){
                similarDestTrains[i] = trains[i];
                count++;
            }
        }
        similarDestTrains = Arrays.copyOf(similarDestTrains, count);
        return similarDestTrains;
    }

    public Train[] similarDestinationTime(String destination, LocalDateTime time) {
        Train[] similarDestTime = new Train[trains.length];
        int count = 0;
        for(int i = 0; i < trains.length; i++) {
            if(trains[i].getDestination().equalsIgnoreCase(destination) && trains[i].getDepartureTime().isAfter(time)){
                similarDestTime[i] = trains[i];
                count++;
            }
        }
        similarDestTime = Arrays.copyOf(similarDestTime, count);
        return similarDestTime;
    }

    public Train[] similarDestinationCommon(String destination) {
        Train[] similarDestCommon = new Train[trains.length];
        int count = 0;
        for(int i = 0; i < trains.length; i++) {
            if(trains[i].getDestination().equalsIgnoreCase(destination) && trains[i].getCommonSits() != 0){
                similarDestCommon[i] = trains[i];
                count++;
            }
        }
        similarDestCommon = Arrays.copyOf(similarDestCommon, count);
        return similarDestCommon;
    }

    public Train trainByNumber(int number) {
        int index = binarySearch(trains, number);
        if(index == -1) {
            return null;
        } else {
            return trains[index];
        }
    }

    private int binarySearch(Train trainArray[], int number) {

        int left = 0;
        int right = trainArray.length - 1;

        while(left < right) {
            int middle = (left + right) / 2;
            if(trainArray[middle].getNumber() == number) {
                return middle;
            } else if(trainArray[middle].getNumber() < number) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return -1;
    }

    public Train[] moreLuxSits(int givenLuxSits) {
        Train[] moreLuxSits = new Train[trains.length];
        int count = 0;
        for(int i = 0; i < trains.length; i++) {
            if(trains[i].getLuxSits() > givenLuxSits){
                moreLuxSits[i] = trains[i];
                count++;
            }
        }
        moreLuxSits = Arrays.copyOf(moreLuxSits, count);
        return moreLuxSits;
    }
}
