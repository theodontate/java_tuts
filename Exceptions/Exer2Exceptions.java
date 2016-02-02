package Exceptions;

/**
 * Created by theartiste on 2/2/16.
 */
public class Exer2Exceptions {
    public static void main(String[] args) {
        FullConstructors k = null;
        try {
            k.f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}
