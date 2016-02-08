/**
 * Created by theartiste on 2/8/16.
 */
class BaseBallException extends Exception {

}

class FoulException extends BaseBallException {

}

class Strike extends BaseBallException {

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

public class StormyInning {

}
