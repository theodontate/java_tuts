package ClassesInsideInterfaces;

/**
 * Created by theartiste on 1/6/16.
 */
public class MultiInterfaces {
    public static void takesA(A a) {}
    public static void takesB(B b) {}

    public static void main(String[] args) {
        X x = new X();
        takesA(x);
        takesB(x);

        Y y = new Y();
        takesA(y);
        takesB(y.makeB());

    }
}
