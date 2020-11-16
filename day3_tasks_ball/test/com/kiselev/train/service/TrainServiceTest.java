package com.kiselev.train.service;

import com.kiselev.train.entity.Depot;
import com.kiselev.train.entity.Train;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.testng.Assert.assertSame;

public class TrainServiceTest {
    @Test
    public void trainTest() {
        Train[] trains = new Train[]{
                new Train("Minsk", 4, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 11, 30), 6,6,6,6),
                new Train("Moscow", 12, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 12, 30), 10,12,10,4),
                new Train("Brest", 67, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 13, 30), 20,20,20,10),
                new Train("Minsk", 6, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 14, 30), 30,14,16,0)
        };
        Depot depot = new Depot(trains);
        String dest = "Minsk";
        int luxSits = 4;
        LocalDateTime time = LocalDateTime.of(2020, Month.NOVEMBER,
                15, 12, 30);
        int num = 67;
        Train[] expectedDest = new Train[]{
                new Train("Minsk", 4, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 11, 30), 6,6,6,6),
                new Train("Minsk", 6, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 14, 30), 30,14,16,0)
        };
        /*Train[] similarDestTrain, Train[] similarDestTime, Train[] similarDestCommon,
                                Train trainByNumber, Train[] moreLuxSits*/
        Train[] expectedDestTime = new Train[]{
                new Train("Minsk", 6, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 14, 30), 30,14,16,0)
        };
        Train[] expectedDestCommon = new Train[]{
                new Train("Minsk", 4, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 11, 30), 6,6,6,6),
                new Train("Minsk", 6, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 14, 30), 30,14,16,0)
        };
        Train[] expectedLuxSits = new Train[]{
                new Train("Minsk", 4, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 11, 30), 6,6,6,6),
                new Train("Brest", 67, LocalDateTime.of(2020, Month.NOVEMBER,
                        15, 13, 30), 20,20,20,10)
        };
        Train expectedByNum = new Train("Brest", 67, LocalDateTime.of(2020, Month.NOVEMBER,
                15, 13, 30), 20,20,20,10);
        TrainService service = new TrainService();

        Train[] actualDest = service.similarDestination(depot, dest);
        Train[] actualDestTime = service.similarDestinationTime(depot, dest, time);
        Train[] actualDestCommon = service.similarDestinationCommon(depot, dest);
        Train[] actualLuxSits = service.moreLuxSits(depot, luxSits);
        Train actualByNum = service.trainByNumber(depot, num);

        Depot actualTemp = new Depot(actualDest);
        Depot expectedTemp = new Depot(expectedDest);
        assertSame(actualTemp.toString(), expectedTemp.toString());
        actualTemp = new Depot(actualDestTime);
        expectedTemp = new Depot(expectedDestTime);
        assertSame(actualTemp.toString(), expectedTemp.toString());
        actualTemp = new Depot(actualDestCommon);
        expectedTemp = new Depot(expectedDestCommon);
        assertSame(actualTemp.toString(), expectedTemp.toString());
        actualTemp = new Depot(actualLuxSits);
        expectedTemp = new Depot(expectedLuxSits);
        assertSame(actualTemp.toString(), expectedTemp.toString());
        Train tempActual = new Train(actualByNum);
        Train tempExpected = new Train(expectedByNum);
        assertSame(tempActual.toString(), tempExpected.toString());
    }
}
