/**
 * Created by theartiste on 1/5/16.
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {

        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 obj = new Parcel8();
        Wrapping wrapping = obj.wrapping(10);
        System.out.println(wrapping.value());
    }
}
