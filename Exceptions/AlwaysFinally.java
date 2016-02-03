package Exceptions;

/**
 * Created by theartiste on 2/3/16.
 */
class FourException extends Exception{}

public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering first try block");
        try {
            System.out.println("Entering second try block");
            try {
                throw new FourException();
            } finally {
                System.out.println("Carrots are cooked.");
            }
        } catch (FourException e) {
            e.printStackTrace(System.out);
            System.out.println("FourException caught in first try block");
        } finally {
            System.out.println("finally in first try block");
        }
    }

}
