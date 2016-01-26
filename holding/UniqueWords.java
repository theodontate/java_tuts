package holding;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by theartiste on 1/26/16.
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("SetOperations.java", "\\W+"));
        char[] a;
        int numberOfVowels = 0;

        for(String temp : words) {
            a = temp.toCharArray();
            for (char c : a) {
                switch(c) {
                    case 'a':
                        numberOfVowels++;
                        break;

                    case 'A':
                        numberOfVowels++;
                        break;

                    case 'e':
                        numberOfVowels++;
                        break;

                    case 'E':
                        numberOfVowels++;
                        break;

                    case 'i':
                        numberOfVowels++;
                        break;

                    case 'I':
                        numberOfVowels++;
                        break;

                    case 'o':
                        numberOfVowels++;
                        break;

                    case 'O':
                        numberOfVowels++;
                        break;

                    case 'u':
                        numberOfVowels++;
                        break;

                    case 'U':
                        numberOfVowels++;
                        break;
                }
            }
            System.out.println("number of vowels in " + temp + " : " + numberOfVowels);
            numberOfVowels = 0;
        }

        System.out.println(words);
    }
}
