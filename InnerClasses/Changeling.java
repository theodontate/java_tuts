package InnerClasses;

/**
 * Created by theartiste on 1/4/16.
 */
public class Changeling {
    private String string;

    Changeling(String string) {
        this.string = string;
    }

    private class InnerChangeling {

        public String toString() {
            return string;
        }
    }

    public InnerChangeling getInnerChangeling() {
        return new InnerChangeling();
    }

    public static void main(String[] args) {
        Changeling one = new Changeling("love");
        InnerChangeling two = one.getInnerChangeling();
        System.out.println(two);
    }
}
