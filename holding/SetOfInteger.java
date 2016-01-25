package holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by theartiste on 1/21/16.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intSet = new TreeSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            intSet.add(rand.nextInt(30));
        }

        System.out.println(intSet);
    }
}
