package Factories;

/**
 * Created by theartiste on 1/4/16.
 */
public class CoinFactory implements TossableFactory {

    public Tossable getTossable() {
        return new Coin();
    }


}
