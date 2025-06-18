
public class FinancialForecast {
    public static double forecastRevenue(double currentRevenue, double growthRate, int years) {
        return currentRevenue * Math.pow((1 + growthRate), years);
    }

    public static void main(String[] args) {
        double currentRevenue = 100000; // 1 Lakh
        double growthRate = 0.08; // 8%
        int years = 5;

        System.out.println("current revenue:" + currentRevenue);
        System.out.println("growth rate:" + growthRate);
        System.out.println("years:" + years);

        double forecastedRevenue = forecastRevenue(currentRevenue, growthRate, years);
        System.out.printf("Forecasted Revenue in %d years: %.2f\n", years, forecastedRevenue);
    }
}
