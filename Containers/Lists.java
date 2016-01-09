package Containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by theartiste on 1/9/16.
 */
public class Lists {
    public static void main(String[] args) {
        Set<Integer> e = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            e.add(i);
        }

        for (int temp : e) {
            System.out.println(temp);
        }

    }
}
