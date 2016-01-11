package holding;

import java.util.ArrayList;

/**
 * Created by theartiste on 1/11/16.
 */
public class GetInts {
    private static ArrayList<Integer> result;

    public static ArrayList<Integer> arrayList(int count) {
        result = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            result.add(i);
        }

        return result;
    }
}
