import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by theartiste on 1/3/16.
 */
public class ScannerDemo implements Readable {
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aieou".toCharArray();
    private int count;

    public ScannerDemo(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length - 1)]);
            cb.append(lowers[rand.nextInt(lowers.length - 1)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new ScannerDemo(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
