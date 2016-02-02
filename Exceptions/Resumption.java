package Exceptions;

/**
 * Created by theartiste on 2/2/16.
 */
public class Resumption {
    private static int index = 0;

    public static void g() throws MyAwesomeException {
        if (index++ == 10) {
            System.out.println(index - 1);
        } else {
            System.out.println(index - 1);
            throw new MyAwesomeException("this isn't good.");
        }
    }

    public static void main(String[] args) {
        while(true) {
            try {
                g();
                break;
            } catch (MyAwesomeException e) {
                e.printStackTrace(System.out);
            }
        }

        System.out.println("Program terminating.");
    }
}
