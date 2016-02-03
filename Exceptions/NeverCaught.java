package Exceptions;

/**
 * Created by theartiste on 2/3/16.
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");

    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
