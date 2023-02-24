package ru.netology.stats.calculateSales.services;

public class StatsService {

    public int sumAllSales(int count) {
        int sum;
        sum = count;

        return sum;
    }


    public int middleSumAllSales(int count) {
        int middleSum;
        middleSum = count;

        return middleSum;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальрыми продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int monthsSalesUnderMiddle(int[] sales, int middleSum) {
        int monthsUnderMiddle = 0; //счетчик месяцев продаж ниже среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middleSum) {
                monthsUnderMiddle++;
            }
        }

        return monthsUnderMiddle;
    }


    public int monthsSalesOverMiddle(int[] sales, int middleSum) {
        int monthsOverMiddle = 0; //счетчик месяцев продаж выше среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middleSum) {
                monthsOverMiddle++;
            }
        }

        return monthsOverMiddle;
    }
}
