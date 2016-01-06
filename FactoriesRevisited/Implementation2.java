package FactoriesRevisited;

/**
 * Created by theartiste on 1/6/16.
 */
public class Implementation2 implements service {

    private Implementation2() {
    }

    public void method1() {
        System.out.println("Implementation 2 : method1");
    }

    public void method2() {
        System.out.println("Implementation 2 : method2");
    }

    public static ServiceFactory getServiceFactory() {
        return new ServiceFactory() {

            @Override
            public service getService() {
                return new Implementation2();
            }
        };
    }
}
