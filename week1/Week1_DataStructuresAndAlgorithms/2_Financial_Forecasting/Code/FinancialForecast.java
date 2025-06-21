public class FinancialForecast {

   
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        
        if (years == 0) {
            return currentValue;
        }

        
        double nextYearValue = currentValue * (1 + growthRate / 100);
        return predictFutureValue(nextYearValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 10000.0;   
        double growthRate = 5.0;
        int forecastYears = 5;           

        double futureValue = predictFutureValue(initialValue, growthRate, forecastYears);
        System.out.printf("Future value after %d years: ₹%.2f\n", forecastYears, futureValue);
    }
}
