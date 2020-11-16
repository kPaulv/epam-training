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
            Train[] similarDestTrain = service.similarDestination(depot, "Minsk");
            Train[] similarDestTime = service.similarDestinationTime(depot, "Minsk",
                                                                    LocalDateTime.of(2020, Month.NOVEMBER,
                                                                                     15, 12, 0));
            Train[] similarDestCommon = service.similarDestinationCommon(depot, "Minsk");
            Train trainByNumber = service.trainByNumber(depot, 6);
            Train[] moreLuxSits = service.moreLuxSits(depot, 4);
            TrainsReport report = new TrainsReport();
            report.showTrainsLists(similarDestTrain, similarDestTime, similarDestCommon, trainByNumber, moreLuxSits);
        } catch (InputMismatchException e) {
            System.out.println("Wrong input!");
        }
    }
}

