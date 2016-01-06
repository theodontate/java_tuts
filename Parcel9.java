import InnerClasses.Destination;

/**
 * Created by theartiste on 1/6/16.
 */
public class Parcel9 {

    public Destination destination(String x) {
        return new Destination() {
            private String label = x;
            public String readLabel() {
                return x;
            }
        };
    }

}
