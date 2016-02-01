package holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by theartiste on 1/26/16.
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int highestCount = 0;

        for (int i = 0; i < 100000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }

        for (Integer count : m.values()) {
            if (count > highestCount) highestCount = count;
        }

        for (Integer key : m.keySet()) {
            if (highestCount == m.get(key)) {
                System.out.println(key + " has the highest occurence count " + highestCount);
            }
        }

        System.out.println(m);
    }
}
