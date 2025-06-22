import java.util.Arrays;
import java.util.List;

public class FinancialForecast {
    public static double forecastNextMonth(List<Double> revenues) {
        int size = revenues.size();
        if (size < 2) {
            throw new IllegalArgumentException("Need at least 2 months of data.");
        }

        double totalGrowthRate = 0;
        for (int i = 1; i < size; i++) {
            double previous = revenues.get(i - 1);
            double current = revenues.get(i);
            totalGrowthRate += (current - previous) / previous;
        }

        double avgGrowthRate = totalGrowthRate / (size - 1);
        double lastRevenue = revenues.get(size - 1);
        return lastRevenue + (lastRevenue * avgGrowthRate);
    }

    public static void main(String[] args) {
        List<Double> revenues = Arrays.asList(10000.0, 10500.0, 11000.0, 11600.0);
        double forecast = forecastNextMonth(revenues);
        System.out.println("Forecasted Revenue for Next Month: ₹" + forecast);
    }
}
