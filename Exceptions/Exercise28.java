package Exceptions;

/**
 * Created by theartiste on 2/8/16.
 */

class StupidException extends Exception {

}

class Stupidity {
    private int a = 3;

    public void doIt() throws StupidException {
        if (a == 3) {
            throw new StupidException();
        }
    }

}

public class Exercise28 {
    public static void main(String[] args) {
        Stupidity s = new Stupidity();
        try {
            s.doIt();
        } catch (StupidException e) {
            e.printStackTrace(System.out);
        }

    }

}
