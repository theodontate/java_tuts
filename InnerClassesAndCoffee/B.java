package InnerClassesAndCoffee;

import com.sun.tools.javac.util.ArrayUtils;

/**
 * Created by theartiste on 1/6/16.
 */
public class B {
    private U[] uArray = new U[10];
    private int i = 0;

    public void store(U a) {
        uArray[i++] = a;
    }

    public void nullify(U a) {
        for (int i = 0; i < 10; i++) {
            if (uArray[i] == a) {
                ((A) uArray[i]).setDeleted();
            }
        }
    }

    public void callEmAll() {
        int i = 0;
        for (U temp : uArray) {
            if (!((A) temp).getDelState()) {
                System.out.println(i + "th : ");
                temp.doA();
                temp.doB();
            }
        }
    }


}
