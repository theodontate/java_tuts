package Containers;

import java.util.ArrayList;

/**
 * Created by theartiste on 1/9/16.
 */
public class ContainerUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Fuji());
        apples.add(new Gala());
        apples.add(new Braeburn());

        for (Apple temp : apples) {
            System.out.println(temp);
        }
    }
}
