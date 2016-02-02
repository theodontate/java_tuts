package holding;

import java.util.Arrays;

/**
 * Created by theartiste on 2/2/16.
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.println(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = { "A", "B", "C"};
        test(Arrays.asList(strings));
        /**
         * test(strings); Arrays work with foreach but they are not iterable. In order to make it iterable, it should be explicitly
         * converted into an iterable.
         */

    }
}
