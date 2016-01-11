package holding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by theartiste on 1/11/16.
 */
public class TestingGround {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();


        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        List<Integer> sub = integers.subList(0,4);
        Collections.shuffle(sub);


        System.out.println(integers);


    }
}
