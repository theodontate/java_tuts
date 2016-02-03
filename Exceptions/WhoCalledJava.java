package Exceptions;

/**
 * Created by theartiste on 2/3/16.
 */
public class WhoCalledJava {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            int i = 0;
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(i++ + " : " + ste);
            }
        }
    }

    static void g() { f(); }
    static void h() { g(); }

    public static void main(String[] strgs) {
        f();
        System.out.println("-------------------------");
        g();
        System.out.println("-------------------------");
        h();
        System.out.println("-------------------------");
    }

}
