import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by theartiste on 1/3/16.
 */
public class ScanDemo1 implements Readable {
    private int count;
    public static final char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public int read(CharBuffer cb) {
        Random rand = new Random();
        if(count++ > 5) {
            return -1;
        }
        cb.append(alphabets[rand.nextInt(alphabets.length)]);
        return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new ScanDemo1());
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }

}
