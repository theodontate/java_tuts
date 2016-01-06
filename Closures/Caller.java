package Closures;

/**
 * Created by theartiste on 1/7/16.
 */
public class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }
}
