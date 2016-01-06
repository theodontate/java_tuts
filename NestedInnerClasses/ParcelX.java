package NestedInnerClasses;

/**
 * Created by theartiste on 1/6/16.
 */
public class ParcelX {
    String x = "naveen";

    public class ParcelY {

        public ParcelY(String y) {
            x = y;
        }

        public class ParcelY1 {

            public ParcelY1() {
                System.out.println("Inside ParcelY1 constructor.");
            }
        }
    }

    public void showX() {
        System.out.println(x);
    }

    public static class ParcelZ {
        String x = "soumya loves naveen.";

        public void showX() {
            System.out.println(x);
        }

        public static class ParcelZ1 {

            public ParcelZ1() {
                System.out.println("Inside ParcelZ1 constructor.");
            }
        }
    }
}
