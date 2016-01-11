package holding;

import java.util.ArrayList;

/**
 * Created by theartiste on 1/10/16.
 */
public class Pets {
    private static ArrayList<Pet> pets = new ArrayList<>();

    public static ArrayList<Pet> arrayList(int a) {
        for (int i = 0; i < a; i++) {
            pets.add(new Pet("Roger" + i));
        }

        return pets;
    }
}
