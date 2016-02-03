package Exceptions;

/**
 * Created by theartiste on 2/3/16.
 */
class OneException extends Exception {
    public OneException(String msg) {
        super(msg);
    }
}

class TwoException extends Exception {
    public TwoException(String msg) {
        super(msg);
    }
}

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                RethrowNew.f();
            } catch (OneException e) {
                System.out.println("Caught in inner try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("thrown from main()");
            }
        } catch (TwoException e) {
            System.out.println("Caught in outer try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }

}
