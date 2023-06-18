package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int result1 = service.totalSales(salesByMonths);
        int result2 = service.averageMonthSales(salesByMonths);
        int result3 = service.maximumMonthlySales(salesByMonths);
        int result4 = service.minimumMonthlySales(salesByMonths);
        int result5 = service.numberOfMonthsSalesBelowAverage(salesByMonths);
        int result6 = service.numberOfMonthsSalesAboveAverage(salesByMonths);
        System.out.println("Общая сумма продаж: "+result1);
        System.out.println("Среднемесячная величина продаж: "+result2);
        System.out.println("Номер месяца с максимальным объемом продаж: "+result3);
        System.out.println("Номер месяца с минимальным объемом продаж: "+result4);
        System.out.println("Количество месяцев с продажами ниже среднего: "+result5);
        System.out.println("Количество месяцев с продажами выше среднего: "+result6);

    }
}