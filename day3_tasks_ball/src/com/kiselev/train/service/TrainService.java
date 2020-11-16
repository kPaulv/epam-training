package com.kiselev.train.service;

import com.kiselev.train.entity.Train;

import java.time.LocalDateTime;
import java.time.Month;
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
            destination = sc.next();
            num = sc.nextInt();
            departureTime = (LocalDateTime.of(2020, Month.NOVEMBER, 15, hour, 30));
            commonSits = sc.nextInt();
            compartmentSits = sc.nextInt();
            reservedSits = sc.nextInt();
            luxSits = sc.nextInt();
            tempTrain.setDestination(destination);
            tempTrain.setNumber(num);
            tempTrain.setDepartureTime(departureTime);
            tempTrain.setCommonSits(commonSits);
            tempTrain.setCompartmentSits(compartmentSits);
            tempTrain.setReservedSits(reservedSits);
            tempTrain.setLuxSits(luxSits);
            trains[i] = tempTrain;
        }
        sc.close();
        return trains;
    }
}
