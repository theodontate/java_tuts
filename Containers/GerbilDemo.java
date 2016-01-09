package Containers;

import java.util.ArrayList;

/**
 * Created by theartiste on 1/9/16.
 */
public class GerbilDemo {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();

        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil());
        }

        for (Gerbil temp : gerbils) {
            System.out.println(temp.hop());
        }
    }
}
