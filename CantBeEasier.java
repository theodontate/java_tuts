import java.util.ArrayList;

/**
 * Created by theartiste on 1/3/16.
 */
public class CantBeEasier {
    public static void main(String[] args) {
        ArrayList<Integer> multiplesOf3 = new ArrayList<>();
        ArrayList<Integer> multiplesOf5 = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if ((i%3) == 0) multiplesOf3.add(i);
            else if ((i%5) == 0) multiplesOf5.add(i);
        }

        for (Integer multiple : multiplesOf3) {
            sum += multiple;
            System.out.println(multiple);
        }

        System.out.println("---------");

        for (Integer multiple : multiplesOf5) {
            sum += multiple;
            System.out.println(multiple);
        }

        System.out.println("sum : " + sum);

    }
}
