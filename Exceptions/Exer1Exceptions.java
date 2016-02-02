package Exceptions;

/**
 * Created by theartiste on 2/2/16.
 */

class FunnyException extends Exception {
    private String name;

    public FunnyException() {

    }

    public FunnyException(String t) {
        super(t);
        this.name = t;
    }

    public String toString() {
        return this.name;
    }
}


public class Exer1Exceptions {
    public void f() throws FunnyException {
        System.out.println("Throwing exception f()");
        throw new FunnyException();
    }

    public void g() throws FunnyException {
        System.out.println("Throwing exception g()");
        throw new FunnyException("This is really funny");
    }

    public static void main(String[] args) {
        Exer1Exceptions ex = new Exer1Exceptions();
        try {
            ex.f();
        } catch (FunnyException e) {
            e.printStackTrace(System.out);
        }

        try {
            ex.g();
        } catch (FunnyException x) {
            System.out.println(x);
        }

        finally {
            System.out.println("No matter what, I am going to do this.");
        }
    }
}
