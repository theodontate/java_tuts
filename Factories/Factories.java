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

    public static void main(String[] args) {
        serviceConsumer(new ImplementationFactory1());
        serviceConsumer(new ImplementationFactory2());
    }
}
