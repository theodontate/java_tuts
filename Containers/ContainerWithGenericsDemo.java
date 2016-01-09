package Containers;

import java.util.ArrayList;

/**
 * Created by theartiste on 1/9/16.
 */
public class ContainerWithGenericsDemo {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        for (Apple temp : apples) {
            temp.id();
        }
    }
}
