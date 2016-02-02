package holding;

import java.util.*;

/**
 * Created by theartiste on 2/2/16.
 */
public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list1 =
                new ArrayList<Integer>(Arrays.asList(a));
        System.out.println("Before shuffling : " + list1);
        Collections.shuffle(list1, new Random(47));
        System.out.println("After shuffling : " + list1);
        System.out.println("array : " + Arrays.toString(a));

        List<Integer> list2 = Arrays.asList(a);
        System.out.println("Before shuffling : " + list2);
        Collections.shuffle(list2, new Random(47));
        System.out.println("After shuffling : " + list2);
        System.out.println("array : " + Arrays.toString(a));
    }
}
