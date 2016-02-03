package Exceptions;

/**
 * Created by theartiste on 2/4/16.
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("From main()");
        } finally {
            return;
        }
    }
}
