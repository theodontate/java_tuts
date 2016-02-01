package holding;

import java.util.*;

/**
 * Created by theartiste on 1/29/16.
 */
public class exer21 {
    public static void main(String[] args) {
        Map<String, Integer> wordOccurrenceMap = new HashMap<>();
        List<String> words = new ArrayList<String>();
        words.addAll(new TextFile("SetOperations.java", "\\W+"));
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        for (String word : words) {
            if (wordOccurrenceMap.get(word) == null) {
                wordOccurrenceMap.put(word, 1);
            } else {
                int currentOccurenceCount = wordOccurrenceMap.get(word);
                wordOccurrenceMap.put(word, ++currentOccurenceCount);
            }
        }
        System.out.println(words);
        System.out.println("key set : " + wordOccurrenceMap.keySet());
        System.out.println("values : " + wordOccurrenceMap.values());

    }
}
