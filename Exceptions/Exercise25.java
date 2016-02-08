package Exceptions;

/**
 * Created by theartiste on 2/8/16.
 */
class AException extends Exception {

}

class BException extends AException {

}

class CException extends BException {

}

class A {
    public void throwItAll() throws AException {
        throw new AException();
    }
}

class B extends A {
    @Override
    public void throwItAll() throws BException {
        throw new BException();
    }
}

class C extends B {
    @Override
    public void throwItAll() throws CException {
        throw new CException();
    }
}


public class Exercise25 {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.throwItAll();
        } catch (AException e) {
            e.printStackTrace(System.out);
        }


    }
}
