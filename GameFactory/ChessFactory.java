package GameFactory;

/**
 * Created by theartiste on 1/3/16.
 */
public class ChessFactory implements GameFactory {

    public Game getGame() {
        return new Chess();
    }

}
