package com.kiselev.train.main;

import com.kiselev.train.entity.Depot;
import com.kiselev.train.entity.Train;
import com.kiselev.train.report.TrainsReport;
import com.kiselev.train.service.TrainService;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            TrainService service = new TrainService();
            Train[] trains = service.trainsArray();
            Depot depot = new Depot(trains);
            Train[] similarDestTrain = depot.similarDestination("Minsk");
            Train[] similarDestTime = depot.similarDestinationTime("Minsk",
                                                                    LocalDateTime.of(2020, Month.NOVEMBER,
                                                                                     15, 12, 30));
            Train[] similarDestCommon = depot.similarDestinationCommon("Minsk");
            Train trainByNumber = depot.trainByNumber(6);
            Train[] moreLuxSits = depot.moreLuxSits(4);
            TrainsReport report = new TrainsReport();
            report.showTrainsLists(similarDestTrain, similarDestTime, similarDestCommon, trainByNumber, moreLuxSits);
        } catch (InputMismatchException e) {
            System.out.println("Wrong input!");
        }
    }
}
