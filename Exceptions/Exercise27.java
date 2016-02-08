package Exceptions;

/**
 * Created by theartiste on 2/8/16.
 */
public class Exercise27 {
    private int[] a = new int[10];

    public void init() {
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
    }

    public void doSomethingStupid() {
        try {
            System.out.println(a[10]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        Exercise27 e27 = new Exercise27();
        e27.init();
        e27.doSomethingStupid();

    }
}
