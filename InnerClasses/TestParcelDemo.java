package InnerClasses;

/**
 * Created by theartiste on 1/4/16.
 */
public class TestParcelDemo {
    public static void main(String[] args) {
        TestParcel p = new TestParcel();
        Contents c = p.contents();
        Destination d = p.destination("USA");
    }
}
