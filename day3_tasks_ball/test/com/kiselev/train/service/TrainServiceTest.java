package com.kiselev.train.service;

import com.kiselev.train.entity.Depot;
import com.kiselev.train.entity.Train;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.testng.AssertJUnit.assertEquals;

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

        Depot tempActual = new Depot(actualDest);
        Depot tempExpected = new Depot(expectedDest);
        assertEquals(tempActual.toString(), tempExpected.toString());
        tempActual = new Depot(actualDestTime);
        tempExpected = new Depot(expectedDestTime);
        assertEquals(tempActual.toString(), tempExpected.toString());
        tempActual = new Depot(actualDestCommon);
        tempExpected = new Depot(expectedDestCommon);
        assertEquals(tempActual.toString(), tempExpected.toString());
        tempActual = new Depot(actualLuxSits);
        tempExpected = new Depot(expectedLuxSits);
        assertEquals(tempActual.toString(), tempExpected.toString());
        assertEquals(actualByNum.toString(), expectedByNum.toString());
    }
}
