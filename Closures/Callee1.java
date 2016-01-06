package Closures;

/**
 * Created by theartiste on 1/7/16.
 */
public class Callee1 implements Incrementable {
    private int i = 0;

    public void increment() {
        i++;
        System.out.println(i);

    }
}
