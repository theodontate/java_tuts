package Exceptions;

/**
 * Created by theartiste on 2/2/16.
 */
public class Exer4Exception {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            for (int i = 0; i < 11; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.out);
        }
    }
}
