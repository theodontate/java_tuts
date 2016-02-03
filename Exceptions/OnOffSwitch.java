package Exceptions;

/**
 * Created by theartiste on 2/3/16.
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f() throws OnOffException, OnOffException2 {
        throw new RuntimeException("From f()");

    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
        } catch (OnOffException e) {
            System.out.println("OnOffException");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } finally {
            sw.off();
        }
    }
}
