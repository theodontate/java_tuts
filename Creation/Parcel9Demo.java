package Creation;

/**
 * Created by theartiste on 1/6/16.
 */
public class Parcel9Demo {
    public static void main(String[] args) {
        Parcel9 obj = new Parcel9();
        Destination destObj = obj.destination("Tasmania");
        System.out.println(destObj.readLabel());
    }
}
