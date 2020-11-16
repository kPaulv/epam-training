package com.kiselev.train.service;

import com.kiselev.train.entity.Depot;
import com.kiselev.train.entity.Train;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TrainService {
    public Train[] trainsArray() throws InputMismatchException {
        int n = 0;
        Train[] trains;
        System.out.println("Enter trains amount: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        trains = new Train[n];
        System.out.println("Enter trains' data: ");
        String destination;
        int num;
        LocalDateTime departureTime;
        int commonSits;
        int compartmentSits;
        int reservedSits;
        int luxSits;
        Train tempTrain = new Train();
        int hour = 11;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter destination: ");
            destination = sc.next();
            System.out.println("Enter train number: ");
            num = sc.nextInt();
            //System.out.println("Enter departure time: ");
            departureTime = (LocalDateTime.of(2020, Month.NOVEMBER, 15, hour, 30));
            System.out.println("Enter common sits amount: ");
            commonSits = sc.nextInt();
            System.out.println("Enter compartment sits amount: ");
            compartmentSits = sc.nextInt();
            System.out.println("Enter reserved sits amount: ");
            reservedSits = sc.nextInt();
            System.out.println("enter lux sits amount: ");
            luxSits = sc.nextInt();
            tempTrain = new Train(destination, num, departureTime, commonSits, compartmentSits, reservedSits, luxSits);
            trains[i] = tempTrain;
            hour++;
        }
        sc.close();
        return trains;
    }

    public Train[] similarDestination(Depot depot, String destination) {
        Train[] similarDestTrains = new Train[depot.getTrains().length];
        int count = 0;
        for(int i = 0; i < depot.getTrains().length; i++) {
            if(depot.getTrains()[i].getDestination().equalsIgnoreCase(destination)){
                similarDestTrains[count] = depot.getTrains()[i];
                count++;
            }
        }
        similarDestTrains = Arrays.copyOf(similarDestTrains, count);
        return similarDestTrains;
    }

    public Train[] similarDestinationTime(Depot depot, String destination, LocalDateTime time) {
        Train[] similarDestTime = new Train[depot.getTrains().length];
        int count = 0;
        for(int i = 0; i < depot.getTrains().length; i++) {
            if(depot.getTrains()[i].getDestination().equalsIgnoreCase(destination) &&
               depot.getTrains()[i].getDepartureTime().isAfter(time)){
                similarDestTime[count] = depot.getTrains()[i];
                count++;
            }
        }
        similarDestTime = Arrays.copyOf(similarDestTime, count);
        return similarDestTime;
    }

    public Train[] similarDestinationCommon(Depot depot, String destination) {
        Train[] similarDestCommon = new Train[depot.getTrains().length];
        int count = 0;
        for(int i = 0; i < depot.getTrains().length; i++) {
            if(depot.getTrains()[i].getDestination().equalsIgnoreCase(destination) &&
               depot.getTrains()[i].getCommonSits() != 0){
                similarDestCommon[count] = depot.getTrains()[i];
                count++;
            }
        }
        similarDestCommon = Arrays.copyOf(similarDestCommon, count);
        return similarDestCommon;
    }

    public Train trainByNumber(Depot depot, int number) {
        int index = binarySearch(depot.getTrains(), number);
        if(index == -1) {
            return null;
        } else {
            return depot.getTrains()[index];
        }
    }

    private int binarySearch(Train trainArray[], int number) {

        int left = 0;
        int right = trainArray.length - 1;

        while(left <= right) {
            int middle = (left + right) / 2;
            if(trainArray[middle].getNumber() == number) {
                return middle;
            } else if(trainArray[middle].getNumber() < number) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public Train[] moreLuxSits(Depot depot, int givenLuxSits) {
        Train[] moreLuxSits = new Train[depot.getTrains().length];
        int count = 0;
        for(int i = 0; i < depot.getTrains().length; i++) {
            if(depot.getTrains()[i].getLuxSits() > givenLuxSits){
                moreLuxSits[count] = depot.getTrains()[i];
                count++;
            }
        }
        moreLuxSits = Arrays.copyOf(moreLuxSits, count);
        return moreLuxSits;
    }
}
