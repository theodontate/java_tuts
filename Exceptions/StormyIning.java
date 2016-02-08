package Exceptions;

/**
 * Created by theartiste on 2/4/16.
 */
class BaseBallException extends Exception {
}

class Foul extends Exception {
}

class Strike extends Exception {

}

abstract class Ining {
    public void Ining() throws BaseBallException {}
    public void event() throws BaseBallException {}
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

public class StormyIning extends Ining implements Storm {

    public StormyIning() throws RainedOut, BaseBallException {

    }

    public StormyIning(String s) throws RainedOut, BaseBallException {

    }
    //Regular methods must conform to base class.
//    public void walk() throws Foul {
//
//    } Error : because the base class doesn't throw such exceptions.

//    public void event() throws RainedOut {
//
//    } Error : Interface CANNOT add exceptions to existing methods from base class.
    public void rainHard() throws RainedOut{
        //You can choose to not throw any exceptions.
    }
    public void event() {}
    public void atBat() throws PopFoul {
        //Overridden methods can throw inherited exceptions.
    }



}
