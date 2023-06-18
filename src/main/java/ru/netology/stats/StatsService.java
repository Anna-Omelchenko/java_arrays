package ru.netology.stats;

public class StatsService {
    public int totalSales(int[] salesByMonths) {
        int totalSales = 0;
        for (int i = 0; i < salesByMonths.length; i++) {
            totalSales = totalSales + salesByMonths[i];
        }
        return totalSales;
    }

    public int averageMonthSales(int[] salesByMonths) {
        int totalSales = 0;
        for (int i = 0; i < salesByMonths.length; i++) {
            totalSales = totalSales + salesByMonths[i];
        }
        return totalSales / salesByMonths.length;
    }

    public int maximumMonthlySales(int[] salesByMonths) {
        int maximumMonth = 0;
        for (int i = 0; i < salesByMonths.length; i++) {
            if (salesByMonths[i] >= salesByMonths[maximumMonth]) {
                maximumMonth = i;
            }
        }
        return maximumMonth + 1;
    }

    public int minimumMonthlySales(int[] salesByMonths) {
        int minimumMonth = 0;
        for (int i = 0; i < salesByMonths.length; i++) {
            if (salesByMonths[i] <= salesByMonths[minimumMonth]) {
                minimumMonth = i;
            }
        }
        return minimumMonth + 1;
    }

    public int numberOfMonthsSalesBelowAverage(int[] salesByMonths) {
        int averageMonthSales = averageMonthSales(salesByMonths);
        int monthCount = 0;
        for (int i = 0; i < salesByMonths.length; i++) {
            if (salesByMonths[i] < averageMonthSales) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }

    public int numberOfMonthsSalesAboveAverage(int[] salesByMonths) {
        int averageMonthSales = averageMonthSales(salesByMonths);
        int monthCount = 0;
        for (int i = 0; i < salesByMonths.length; i++) {
            if (salesByMonths[i] > averageMonthSales) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }
}


