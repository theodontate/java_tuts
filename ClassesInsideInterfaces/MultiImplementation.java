package ClassesInsideInterfaces;

/**
 * Created by theartiste on 1/6/16.
 */
public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        X1 x1 = new X1();
        takesD(x1);
        takesE(x1.makeE());
    }
}
