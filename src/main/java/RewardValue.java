public class RewardValue {
   private Double cashValue;
    int milesValue;
   public static final double milesToCashRateOfExchange = 0.0035; // RewardValue must convert from miles to cash at a rate of 0.0035.
    public RewardValue(Double cashValue){ // constructor1
        this.cashValue = cashValue;

    }

    public RewardValue(int milesValue){ // constructor2
        this.cashValue = convertMilesToCash(milesValue);

    }

    public double getCashValue() {return this.cashValue;
    }

    public int getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }

    public static double convertMilesToCash(int milesValue) {
        return milesValue * milesToCashRateOfExchange;
    }
    public static int convertCashToMiles(double cashValue){
        return  (int) (cashValue / milesToCashRateOfExchange);
       }



    }


