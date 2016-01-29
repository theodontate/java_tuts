package holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by theartiste on 1/26/16.
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Map<Character, Integer> occurrenceCount = new HashMap<>();
        occurrenceCount.put('a', 0);
        occurrenceCount.put('e', 0);
        occurrenceCount.put('i', 0);
        occurrenceCount.put('o', 0);
        occurrenceCount.put('u', 0);
        words.addAll(new TextFile("SetOperations.java", "\\W+"));
        char[] a;
        Integer existingOccurrenceCount;
        int numberOfVowels = 0;

        for(String temp : words) {
            a = temp.toCharArray();
            for (char c : a) {
                switch(c) {
                    case 'a':
                        numberOfVowels++;
                        existingOccurrenceCount = occurrenceCount.get('a');
                        occurrenceCount.put('a', ++existingOccurrenceCount);
                        break;

                    case 'A':
                        numberOfVowels++;
                        existingOccurrenceCount = occurrenceCount.get('a');
                        occurrenceCount.put('a', ++existingOccurrenceCount);
                        break;

                    case 'e':
                        numberOfVowels++;
                        existingOccurrenceCount = occurrenceCount.get('a');
                        occurrenceCount.put('e', ++existingOccurrenceCount);
                        break;

                    case 'E':
                        numberOfVowels++;
                        existingOccurrenceCount = occurrenceCount.get('a');
                        occurrenceCount.put('e', ++existingOccurrenceCount);
                        break;

                    case 'i':
                        numberOfVowels++;
                        existingOccurrenceCount = occurrenceCount.get('a');
                        occurrenceCount.put('i', ++existingOccurrenceCount);
                        break;

                    case 'I':
                        numberOfVowels++;
                        existingOccurrenceCount = occurrenceCount.get('a');
                        occurrenceCount.put('i', ++existingOccurrenceCount);
                        break;

                    case 'o':
                        numberOfVowels++;
                        existingOccurrenceCount = occurrenceCount.get('a');
                        occurrenceCount.put('o', ++existingOccurrenceCount);
                        break;

                    case 'O':
                        numberOfVowels++;
                        existingOccurrenceCount = occurrenceCount.get('a');
                        occurrenceCount.put('o', ++existingOccurrenceCount);
                        break;

                    case 'u':
                        numberOfVowels++;
                        existingOccurrenceCount = occurrenceCount.get('a');
                        occurrenceCount.put('u', ++existingOccurrenceCount);
                        break;

                    case 'U':
                        numberOfVowels++;
                        existingOccurrenceCount = occurrenceCount.get('a');
                        occurrenceCount.put('u', ++existingOccurrenceCount);
                        break;
                }
            }
            System.out.println("number of vowels in " + temp + " : " + numberOfVowels);
            numberOfVowels = 0;
            System.out.println("Occurrence count of a " + occurrenceCount.get('a'));
            System.out.println("Occurrence count of e " + occurrenceCount.get('e'));
            System.out.println("Occurrence count of i " + occurrenceCount.get('i'));
            System.out.println("Occurrence count of o " + occurrenceCount.get('o'));
            System.out.println("Occurrence count of u " + occurrenceCount.get('u'));
            occurrenceCount.put('a', 0);
            occurrenceCount.put('e', 0);
            occurrenceCount.put('i', 0);
            occurrenceCount.put('o', 0);
            occurrenceCount.put('u', 0);
        }


        System.out.println(words);
    }
}
