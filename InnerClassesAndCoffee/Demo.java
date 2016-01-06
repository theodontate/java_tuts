package InnerClassesAndCoffee;

/**
 * Created by theartiste on 1/7/16.
 */
public class Demo {
    public static void main(String[] args) {
        A[] aArray = new A[10];
        for (int i = 0; i < 10; i++) {
            aArray[i] = new A(Integer.toString(i));
        }

        B b = new B();

        int i = 0;
        while(i < 10){
            b.store(aArray[i++].makeU());
        }

        b.callEmAll();

        b.nullify(2);
        b.nullify(4);
        System.out.println("After nullification.");

        b.callEmAll();
    }
}
