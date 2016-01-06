package Creation;

/**
 * Created by theartiste on 1/6/16.
 */
public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            //Instance initialization for each object.
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget.");
                }
            }

            private String label = dest;

            @Override
            public String readLabel() {
                return label + " Ooha";
            }

        };
    }

}
