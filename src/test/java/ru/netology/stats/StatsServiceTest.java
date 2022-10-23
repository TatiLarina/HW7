package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void getSum() {
        StatsService service = new StatsService();

        int stats[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int exceptedSum = 180;
        int actualSum = service.getSum(stats);

        Assertions.assertEquals(exceptedSum, actualSum);
    }

    @Test
    public void getAverage() {
        StatsService service = new StatsService();

        int stats[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int exceptedAverage = 15;
        int actualAverage = service.getAverage(stats);

        Assertions.assertEquals(exceptedAverage, actualAverage);

    }

    @Test
    public void getMaxMonth() {
        StatsService service = new StatsService();

        int stats[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int exceptedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonth(stats);

        Assertions.assertEquals(exceptedMaxMonth, actualMaxMonth);
    }

    @Test
    public void getMinMonth() {
        StatsService service = new StatsService();

        int stats[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int exceptedMinMonth = 9;
        int actualMinMonth = service.getMinMonth(stats);

        Assertions.assertEquals(exceptedMinMonth, actualMinMonth);
    }

    @Test
    public void getLessAverage() {
        StatsService service = new StatsService();

        int stats[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int exceptedLessAverage = 5;
        int actualLessAverage = service.getLessAverage(stats);

        Assertions.assertEquals(exceptedLessAverage, actualLessAverage);
    }

    @Test
    public void getMoreAverage() {
        StatsService service = new StatsService();

        int stats[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int exceptedMoreAverage = 5;
        int actualMoreAverage = service.getMoreAverage(stats);

        Assertions.assertEquals(exceptedMoreAverage, actualMoreAverage);
    }

}
