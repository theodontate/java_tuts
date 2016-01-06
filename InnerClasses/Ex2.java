package InnerClasses;

/**
 * Created by theartiste on 1/5/16.
 */
public class Ex2 {
    private int a;

    public Ex2(int a) {
        this.a = a;
    }

    private void doA() {
        System.out.println(a);
    }

    private class Ex3 {

        public void manipulateA() {
            doA();
            a = 23;
            doA();
        }
    }

    public void doMagic() {
        Ex3 obj = new Ex3();
        obj.manipulateA();
    }

    public static void main(String[] args) {
        Ex2 obj = new Ex2(12);
        Ex2.Ex3 obj1 = obj.new Ex3();
        obj.doMagic();
    }
}
