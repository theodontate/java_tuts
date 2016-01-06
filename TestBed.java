/**
 * Created by theartiste on 1/6/16.
 */
public class TestBed {
    public void f() {
        System.out.println("f()");
    }

    public static class Tester {

        Tester() {
            String[] temp = new String[10];
            main(temp);
        }

        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
