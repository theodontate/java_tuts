package OverridingInnerClasses;

/**
 * Created by theartiste on 1/7/16.
 */
public class BigEgg extends Egg {
    Yolk k;


    protected class Yolk {

        public Yolk() {
            System.out.println("BigEgg Yolk()");
        }
    }

    public static void main(String[] args) {

        BigEgg obj = new BigEgg();
    }
}
