package holding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by theartiste on 2/1/16.
 * The awesome version of exercise 25 TIJ 4th edition
 */
public class Exer25v2 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        int wordCount = 0;

        for (String word : new TextFile("SetOperations.java", "\\W+")) {
            ArrayList<Integer> loc = map.get(word);

            if (loc == null) {
                loc = new ArrayList<>();
                map.put(word, loc);
            }

            loc.add(++wordCount);
        }

        System.out.println(map);

        TreeMap<Integer, String> words = new TreeMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            for (Integer pos : entry.getValue()) {
                words.put(pos, entry.getKey());
            }
        }

        System.out.println("The File In Its Entirety : ");
        System.out.println(words);
    }
}
