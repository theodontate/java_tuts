package Exceptions;

/**
 * Created by theartiste on 2/3/16.
 */
class ThreeException extends Exception {}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while(true) {
            try {
                if (count++ == 0) {
                   throw new ThreeException();
                }
            } catch (ThreeException e) {
                e.printStackTrace(System.out);
            } finally {
                System.out.println("In finally clause");
                if (count == 2) break;
            }
        }
    }
}
