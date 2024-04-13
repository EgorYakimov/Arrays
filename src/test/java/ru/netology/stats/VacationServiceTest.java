package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VacationServiceTest {
    @Test
    public void testSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.avgSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMin() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMax() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThenAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.lessThenAvgSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void moreThenAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.moreThenAvgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

}
