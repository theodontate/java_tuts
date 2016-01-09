package Containers;

/**
 * Created by theartiste on 1/9/16.
 */
public class Gerbil {
    private int gerbilNumber;
    private static int i = 0;

    Gerbil() {
        gerbilNumber = i++;
    }

    public int hop() {
        return gerbilNumber;
    }
}
