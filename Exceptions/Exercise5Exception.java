package Exceptions;

/**
 * Created by theartiste on 2/2/16.
 */

class MyAwesomeException extends Exception {
    String name;
    public MyAwesomeException() {

    }

    public MyAwesomeException(String name) {
        super(name);
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}


public class Exercise5Exception {
    public static void g() throws MyAwesomeException {
        System.out.println("Throwing exception");
        throw new MyAwesomeException("The most awesome Exception");
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (MyAwesomeException e) {
//            System.out.println(e);
            e.printStackTrace(System.out);
        }
    }

}
