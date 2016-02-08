package Exceptions;

/**
 * Created by theartiste on 2/4/16.
 */
class StormException extends RuntimeException {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

public interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}
