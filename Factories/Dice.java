package Factories;

import java.util.Random;

/**
 * Created by theartiste on 1/4/16.
 */
public class Dice implements Tossable {

    public void toss() {
        Random rand = new Random();
        System.out.println(rand.nextInt(6));
    }
}
