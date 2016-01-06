package FactoriesRevisited;

/**
 * Created by theartiste on 1/6/16.
 */
public class Factory {
    public static void playGame(GameFactory f) {
        Game g = f.getGame();
        while(g.move())
            ;

    }

    public static void main(String[] args) {
        playGame(Chess.factory());
        playGame(Checkers.factory());
    }
}
