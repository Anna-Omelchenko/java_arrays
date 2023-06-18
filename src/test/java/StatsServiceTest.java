import ru.netology.stats.StatsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void shouldCountTotalSales() {
        StatsService service = new StatsService();
        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.totalSales(salesByMonths);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountAverageMonthSales() {
        StatsService service = new StatsService();
        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageMonthSales(salesByMonths);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMaximumMonthlySales() {
        StatsService service = new StatsService();
        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maximumMonthlySales(salesByMonths);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMinimumMonthlySales() {
        StatsService service = new StatsService();
        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minimumMonthlySales(salesByMonths);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountNumberOfMonthsSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.numberOfMonthsSalesBelowAverage(salesByMonths);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountNumberOfMonthsSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.numberOfMonthsSalesAboveAverage(salesByMonths);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
