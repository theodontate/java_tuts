package FactoriesRevisited;

/**
 * Created by theartiste on 1/6/16.
 */
public class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move() {
        System.out.println("Chess moves " + moves);
        return moves++ != MOVES;
    }

    public static GameFactory factory() {
        return new GameFactory() {

            public Game getGame() {
                return new Chess();
            }
        };
    }
}
