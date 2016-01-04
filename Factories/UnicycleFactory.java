package Factories;

/**
 * Created by theartiste on 1/4/16.
 */
public class UnicycleFactory implements CycleFactory {

    public Cycle getCycle() {
        return new UniCycle();
    }
}
