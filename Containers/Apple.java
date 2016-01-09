package Containers;

/**
 * Created by theartiste on 1/9/16.
 */
public class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
