import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by theartiste on 1/10/16.
 */
public class NameGeneratorDemo {

    public static Collection fill(Collection<String> collection, NameGenerator nameGen) {
        for (int i = 0; i < 10; i++) {
            collection.add(nameGen.next());
        }

        return collection;
    }

    public static void main(String[] args) {
        NameGenerator nameGen = new NameGenerator();
        System.out.println(fill(new ArrayList<String>(),nameGen));
        System.out.println(fill(new LinkedList<String>(),nameGen));
        System.out.println(fill(new HashSet<String>(),nameGen));

    }
}
