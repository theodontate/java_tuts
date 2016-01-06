package ClassesInsideInterfaces;

/**
 * Created by theartiste on 1/6/16.
 */
public class Y implements A {
    B makeB() {
       return new B() {};
    }
}
