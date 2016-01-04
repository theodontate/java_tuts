package InnerClasses;

/**
 * Created by theartiste on 1/4/16.
 */
public class Parcel2 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());

    }

    public static void main(String[] args) {
        Parcel2 p2 = new Parcel2();
        p2.ship("North Korea");
        Parcel2 q = new Parcel2();
        Destination usa = q.to("USA");
        Contents c = q.contents();
        Parcel2.Destination d = q.to("Europe");
        Parcel2.Contents con = q.contents();
    }

}
