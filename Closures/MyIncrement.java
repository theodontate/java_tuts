package Closures;

/**
 * Created by theartiste on 1/7/16.
 */
public class MyIncrement {
    public void increment() {
        System.out.println("Other operation.");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}
