package Containers;

import java.util.ArrayList;

/**
 * Created by theartiste on 1/9/16.
 */
public class ContainerDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple) apples.get(i)).id();
        }
    }
}
