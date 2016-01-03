import java.util.ArrayList;

/**
 * Created by theartiste on 1/4/16.
 */
public class EvenFib {
    public static void main(String[] args) {
        ArrayList<Integer> evenValues = new ArrayList<>();
        ArrayList<Integer> fibValues = new ArrayList<>();
        int firstElement = 1, secondElement = 2, result = 0, nextValue = 0;

        fibValues.add(firstElement);
        fibValues.add(secondElement);

        for (int i = 0; nextValue <= 4000000; i++) {
            nextValue = firstElement + secondElement;
            fibValues.add(nextValue);
            firstElement = secondElement;
            secondElement = nextValue;
        }

        for (Integer value : fibValues) {
            System.out.println("value : " + value);
            if ((value%2) == 0) {
                evenValues.add(value);
            }
        }

        for (Integer value : evenValues) {
//            System.out.println("value : " + value);
            result += value;
        }

        System.out.println(result);

    }
}
