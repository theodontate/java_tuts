package Exceptions;

/**
 * Created by theartiste on 2/4/16.
 */
class BaseBallException extends RuntimeException {
}

class Foul extends RuntimeException {
}

class Strike extends RuntimeException {

}

abstract class Ining {
    public void Ining()  {}
    public void event()  {}
    public abstract void atBat();
    public void walk() {}
}

public class StormyIning extends Ining implements Storm {

    public StormyIning() {

    }

    public StormyIning(String s) {

    }
    //Regular methods must conform to base class.
//    public void walk() throws Foul {
//
//    } Error : because the base class doesn't throw such exceptions.

//    public void event() throws RainedOut {
//
//    } Error : Interface CANNOT add exceptions to existing methods from base class.
    public void rainHard() {
        //You can choose to not throw any exceptions.
    }
    public void event() {}
    public void atBat()  {
        //Overridden methods can throw inherited exceptions.
    }

    public static void main(String[] args) {
        StormyIning si = new StormyIning();
        si.atBat();

        Ining i = new StormyIning();
        i.atBat();
    }



}
