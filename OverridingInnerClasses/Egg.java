package OverridingInnerClasses;

/**
 * Created by theartiste on 1/7/16.
 */
public class Egg {
    private Yolk y;

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public Egg() {
        System.out.println("Egg()");
        y = new Yolk();
    }
}
