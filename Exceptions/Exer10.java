package Exceptions;

/**
 * Created by theartiste on 2/3/16.
 */
class TonicException extends Exception {

}

class TesticleException extends Exception {

}


public class Exer10 {

    public void f() throws TonicException {
        try {
            g();
        } catch (TonicException e) {
            throw new RuntimeException(e);
//            e.initCause(new RuntimeException());
//            throw e;
        }

    }

    public void g() throws TonicException{
        throw new TonicException();
    }

    public static void main(String[] args) {
        Exer10 ex = new Exer10();
        try {
            ex.f();
        } catch (TonicException e) {
            e.printStackTrace(System.out);
        } catch (RuntimeException e) {
            e.printStackTrace(System.out);
        }

    }
}
