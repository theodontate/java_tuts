package Factories;

/**
 * Created by theartiste on 1/4/16.
 */
public class DiceFactory implements TossableFactory {

    public Tossable getTossable() {
        return new Dice();
    }
}
