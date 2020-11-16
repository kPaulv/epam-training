package com.kiselev.train.report;

import com.kiselev.train.entity.Train;

public class TrainsReport {
    public void showTrainsLists(Train[] similarDestTrain, Train[] similarDestTime, Train[] similarDestCommon,
                                Train trainByNumber, Train[] moreLuxSits) {
        System.out.println("Trains with similar destination: ");
        for(Train train : similarDestTrain) {
            System.out.println(train.toString());
        }
        System.out.println("Trains with similar destination and after definite time: ");
        for(Train train : similarDestTime) {
            System.out.println(train.toString());
        }
        System.out.println("Trains with similar destination and common sits: ");
        for(Train train : similarDestCommon) {
            System.out.println(train.toString());
        }
        System.out.println("Train by number: ");
        System.out.println(trainByNumber.toString());
        System.out.println("Trains with more lux sits than given: ");
        for(Train train : moreLuxSits) {
            System.out.println(train.toString());
        }
    }
}
