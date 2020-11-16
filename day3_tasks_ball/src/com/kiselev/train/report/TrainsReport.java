package com.kiselev.train.report;

import com.kiselev.train.entity.Train;

public class TrainsReport {
    public void showTrainsLists(Train[] similarDestTrain, Train[] similarDestTime, Train[] similarDestCommon,
                                Train trainByNumber, Train[] moreLuxSits) {
        System.out.println("Trains with similar destination: ");
        if(similarDestTrain.length == 0) {
            System.out.println("No trains with this destination.");
        } else {
            for (Train train : similarDestTrain) {
                System.out.println(train.toString());
            }
        }
        System.out.println("Trains with similar destination and after definite time: ");
        if(similarDestTime.length == 0) {
            System.out.println("No trains with this destination and time.");
        } else {
            for (Train train : similarDestTime) {
                System.out.println(train.toString());
            }
        }
        System.out.println("Trains with similar destination and common sits: ");
        if(similarDestCommon.length == 0) {
            System.out.println("No trains with this destination and common sits.");
        } else {
            for (Train train : similarDestCommon) {
                System.out.println(train.toString());
            }
        }
        System.out.println("Train by number: ");
        if(trainByNumber == null) {
            System.out.println("No trains with this number.");
        } else {
            System.out.println(trainByNumber.toString());
        }
        System.out.println("Trains with more lux sits than given: ");
        if(moreLuxSits.length == 0) {
            System.out.println("No trains with more lux sits then given.");
        } else {
            for (Train train : moreLuxSits) {
                System.out.println(train.toString());
            }
        }
    }
}
