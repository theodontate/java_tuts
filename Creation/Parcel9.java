package Creation;

/**
 * Created by theartiste on 1/6/16.
 */
public class Parcel9 {
    //Argument must be final to use inside
    //Anonymous inner class
    public Destination destination(String dest) {
        return new Destination() {
            String label = dest;

            @Override
            public String readLabel() {
                return "\"" + label+ "\"";
            }
        };
    }
}
