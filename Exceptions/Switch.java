package Exceptions;

/**
 * Created by theartiste on 2/3/16.
 */

class OnOffException extends Exception {}

class OnOffException2 extends Exception {}

public class Switch {
    private boolean state = false;

    private boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    public String toString() {
        return state ? "on" : "off";
    }
}
