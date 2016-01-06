package Creation;

/**
 * Created by theartiste on 1/6/16.
 */
public class Parcel10Demo {
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination obj = p.destination("America" , 1500);
        System.out.println(obj.readLabel());
    }
}
