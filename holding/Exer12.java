package holding;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by theartiste on 1/21/16.
 */
public class Exer12 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        List<Integer> revValues = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            values.add(i);
        }

        ListIterator<Integer> it = values.listIterator(values.size());

        while (it.hasPrevious()) {
            revValues.add(it.previous());
        }

        //Reverse awesomeness
        for (Integer t : revValues) {
            System.out.println(t);
        }

        System.out.println("Program terminating.");

    }
}
