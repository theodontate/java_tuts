package FactoriesRevisited;

/**
 * Created by theartiste on 1/6/16.
 */
public class FactoriesRevisitedDemo {
    public static void serviceConsumer(ServiceFactory f) {
        service s = f.getService();
        s.method1();
        s.method2();
    }


    public static void main(String[] args) {
        serviceConsumer(Implementation1.getServiceFactory());;
        serviceConsumer(Implementation2.getServiceFactory());;
    }
}
