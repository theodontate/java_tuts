package Exceptions;

/**
 * Created by theartiste on 2/4/16.
 */
class VeryImportantException extends Exception {
    public String toString() {
        return "this is a very important exception !";
    }
}

class HoHolumException extends Exception {
    public String toString() {
        return "this is a trifling exception";
    }
}

public class LostMessage {

    public void g() throws VeryImportantException {
        throw new VeryImportantException();
    }

    public void f() throws HoHolumException {
        throw new HoHolumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.g();
            } finally {
                try {
                    lm.f();
                } catch (HoHolumException e) {
                    e.printStackTrace(System.out);
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

}
