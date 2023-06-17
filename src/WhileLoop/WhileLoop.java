package WhileLoop;

public class WhileLoop {
    public static void main(String[] args) {

        //Write a while loop
        //Use the calculation for exchange rate below
        //1 + (Math.random() * 0.2);
        //To recalculate our rate every day (once per loop)
        //Print the number of days it takes for our bot to sell its pounds

        int days = 0;
        int fundsInPounds = 10000;
        int fundsToSellDailyInPounds = 1000;
        double ExchangeRateToSell = 1.15;

        while (fundsInPounds > 0) {
            double exchangeRate = 1 + (Math.random() * 0.2);
            days++;

            if (exchangeRate >= ExchangeRateToSell ) {
                fundsInPounds -= fundsToSellDailyInPounds;
            }
            System.out.println("Day: " + days + "");
            System.out.println("Daily exchange rate is " + exchangeRate);
            System.out.println("Pounds available: " + fundsInPounds);
            System.out.println(" ");
        }

        System.out.println("Funds depleted in " + days + " days.");

    }
}
