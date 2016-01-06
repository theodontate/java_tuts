package Creation;

/**
 * Created by theartiste on 1/6/16.
 */
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return  new Base(i) {
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }
}
