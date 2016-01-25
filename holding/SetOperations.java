package holding;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by theartiste on 1/21/16.
 */
public class SetOperations {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Collections.addAll(set1, "A B C D E F G H I J K L M N O P Q R S T".split(" "));
        set1.add("U");
        System.out.println("H : " + set1.contains("H"));
        System.out.println("Z : " + set1.contains("Z"));

        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "O P Q R S T".split(" "));
        System.out.println("set2 in set1 : " + set1.containsAll(set2));
        set1.remove("H");
        System.out.println("set1 : " + set1);
        System.out.println("set2 in set1 : " + set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println("set2 removed from set1 : " + set1);
        Collections.addAll(set1, "X Y Z".split(" "));
        System.out.println("'X Y Z' added to set1 : " + set1);

    }
}
