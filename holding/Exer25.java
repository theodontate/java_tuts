package holding;

import java.util.*;

/**
 * Created by theartiste on 2/1/16.
 */
public class Exer25 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();
        List<String> words = new ArrayList<>();
        words.addAll(new TextFile("SetOperations.java", "\\W+"));
        uniqueWords.addAll(new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);

        for (String uniqueWord : uniqueWords) {
            int wordCount = 0;
            ArrayList<Integer> occurrences = new ArrayList<>();
            for (String word : words) {
                wordCount++;
                if (word.matches(uniqueWord)) {
                    occurrences.add(wordCount);
                }
            }
            map.put(uniqueWord, occurrences);
        }

        for (String uniqueWord : map.keySet()) {
            System.out.println(uniqueWord + " : " + map.get(uniqueWord));
        }
    }
}
