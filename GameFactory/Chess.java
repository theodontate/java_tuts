package GameFactory;

/**
 * Created by theartiste on 1/3/16.
 */
public class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}
