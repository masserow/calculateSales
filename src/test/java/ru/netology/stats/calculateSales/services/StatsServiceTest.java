package ru.netology.stats.calculateSales.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumAllSales() {
        StatsService service = new StatsService();
        //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int count = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        int expected = 180;
        int actual = service.sumAllSales(count);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMiddleSumAllSales() {
        StatsService service = new StatsService();
        //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int count = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        int expected = 15;
        int actual = service.middleSumAllSales(count);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {7, 7, 7, 7, 7, 7, 7, 7, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void shouldFindUnderMiddleSalesMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int middleSum = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        int expectedMonths = 5;
        int actualMonths = service.monthsSalesUnderMiddle(sales, middleSum);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }


    @Test
    public void shouldFindOverMiddleSalesMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int middleSum = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        int expectedMonths = 5;
        int actualMonths = service.monthsSalesOverMiddle(sales, middleSum);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}
