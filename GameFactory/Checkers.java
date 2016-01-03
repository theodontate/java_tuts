package GameFactory;

/**
 * Created by theartiste on 1/3/16.
 */
public class Checkers implements Game{
    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}
