package holding;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by theartiste on 1/21/16.
 */
public class Exer14 {
    public static void main(String[] args) {
        LinkedList<Integer> values = new LinkedList<Integer>();
        ListIterator<Integer> it = values.listIterator();

        for (int i = 0; i < 10; i++) {
            System.out.println("values ver" + i + " : " + values);
            if (values.peek() == null) {
                values.add(i);
            } else {
                if (values.size() > 1) {
                    values.add(values.size()/2, i);
                    continue;
                }
                values.add(i);
            }
        }

        System.out.print("\nValues : ");
        for (Integer t : values) {
            System.out.print(t);
        }

        System.out.println("\nProgram terminating.");

    }
}
