public class RewardValue {
    Double cashValue;
    int milesValue;
    public RewardValue(Double cashValue){ // constructor1
        this.cashValue = cashValue;

    }
    public RewardValue(int milesValue){ // constructor2
        this.milesValue = milesValue;

    }

    public double getCashValue() {return cashValue;
    }

    public int getMilesValue() {return milesValue;
    }
}
