package holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by theartiste on 2/2/16.
 */
public class ForEachCollection {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs,
                "Take the long way home".split(" ")
        );

        for (String temp : cs) {
            System.out.println(temp);
        }
    }
}
