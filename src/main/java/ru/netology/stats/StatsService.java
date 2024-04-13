package ru.netology.stats;

public class StatsService {
    public long sumSales(long [] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }
    public long avgSales(long [] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int maxSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int lessThenAvgSales(long[] sales) {
        long avg = avgSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count++;
            }
        }
        return count;
    }
    public int moreThenAvgSales(long[] sales) {
        long avg = avgSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                count++;
            }
        }
        return count;
    }



}
