package NestedInnerClasses;

/**
 * Created by theartiste on 1/6/16.
 */
public class ParcelXDemo {
    public static void main(String[] args) {
        ParcelX obj = new ParcelX();
        ParcelX.ParcelY obj1 = obj.new ParcelY("Soumya Naveen");
        ParcelX.ParcelY.ParcelY1 obj2 = obj1.new ParcelY1();

        ParcelX.ParcelZ obj3 = new ParcelX.ParcelZ();
        ParcelX.ParcelZ.ParcelZ1 obj4 = new ParcelX.ParcelZ.ParcelZ1();
    }
}
