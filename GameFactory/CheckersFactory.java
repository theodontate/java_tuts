package GameFactory;

/**
 * Created by theartiste on 1/3/16.
 */
public class CheckersFactory implements GameFactory {

    public Game getGame() {
        return new Checkers();
    }
}
