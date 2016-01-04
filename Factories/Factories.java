package Factories;

/**
 * Created by theartiste on 1/3/16.
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void serviceCycle(CycleFactory fact) {
        Cycle c = fact.getCycle();
        c.ride();
    }

    public static void serviceTossable(TossableFactory fact) {
        Tossable t = fact.getTossable();
        t.toss();
    }

    public static void main(String[] args) {
        serviceConsumer(new ImplementationFactory1());
        serviceConsumer(new ImplementationFactory2());
        serviceCycle(new UnicycleFactory());
        serviceCycle(new BicycleFactory());
        serviceCycle(new TricycleFactory());
        serviceTossable(new CoinFactory());
        serviceTossable(new DiceFactory());
    }
}
