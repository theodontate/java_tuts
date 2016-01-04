package Factories;

/**
 * Created by theartiste on 1/4/16.
 */
public class BicycleFactory implements CycleFactory {

    public Cycle getCycle() {
        return new Bicycle();
    }
}
