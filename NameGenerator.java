import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by theartiste on 1/10/16.
 */
public class NameGenerator {
    private ArrayList<String> names;
    private static int index;

    public NameGenerator() {
        names = new ArrayList<>();
        names.add("Cobb");
        names.add("Maurice Fischer");
        names.add("Mal");
        names.add("Arthur");
        names.add("Eames");
        names.add("Fischer");
        names.add("Yusuf");
        names.add("Phillipa");
        names.add("Saito");
        names.add("Blonde");
        names.add("Ariadne");
        names.add("Private Nurse");
    }
    public String next() {
        if (hasNext()) {
            return names.get(index++);
        } else {
            index = 0;
            return names.get(index++);
        }
    }

    public boolean hasNext() {
        if (index < names.size()) {
            return true;
        } else {
            return false;
        }
    }
}
