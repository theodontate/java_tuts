/**
 * Created by theartiste on 2/8/16.
 */
class BaseBallException extends Exception {

}

class FoulException extends BaseBallException {

}

class Strike extends BaseBallException {

}

class UmpireArgument extends Exception {

}

abstract class Inning {
    public Inning() throws BaseBallException {

    }

    public void event() throws BaseBallException {

    }

    public abstract void atBat() throws Strike, FoulException;

    public void walk() {

    }
}

class StormException extends Exception {
}

class RainedOut extends StormException {

}

class PopFoul extends FoulException {

}

interface Stormie {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Stormie {
    //The constructors of the inherited class need only throw the exception provided by the base class. They can also throw
    //some of their own if they want.

    public StormyInning() throws BaseBallException, RainedOut {

    }

    public StormyInning(String s) throws FoulException, BaseBallException {

    }
    //The regular methods should conform to the base class version.

//    ! public void walk() throws FoulException {
//
//    }

    @Override
    public void walk() {

    }

    //Interface can't add exceptions to existing methods from the base class
//    ! public void event() throws BaseBallException {
//
//    }


    //if the method doesn't exist in the base class, it is ok for the interface to add exceptions.
    public void rainHard() throws RainedOut {

    }

    //You can choose to not throw any exceptions even if the base version does.
    public void event() {

    }

    //Overriden methods can throw inherited exceptions
    public void atBat() throws Strike, PopFoul {

    }

    public void throwShit() throws UmpireArgument {
        throw new UmpireArgument();

    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
            si.throwShit();
        } catch (RainedOut e) {
            e.printStackTrace(System.out);
        } catch (PopFoul e) {
            e.printStackTrace(System.out);
        } catch (BaseBallException e) {
            e.printStackTrace(System.out);
        } catch (UmpireArgument e) {
            e.printStackTrace();
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (BaseBallException e) {
            e.printStackTrace(System.out);
        } catch (RainedOut e) {
            e.printStackTrace();
        }


    }

}
