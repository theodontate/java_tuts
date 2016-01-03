import java.util.ArrayList;

/**
 * Created by theartiste on 1/4/16.
 */
public class primeFac {
    public static void main(String[] args) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        long theNumber = 600851475143L;
        long bound = (long) Math.sqrt(theNumber);
        long largestPrimeFactor = 1;
        int numberOfFactors = 0;

        System.out.println(theNumber);
        System.out.println("bound : " + bound);

        for (int i = 2; i < (int) bound; i++) {
            if ((theNumber%i) == 0) {
                for (int j = 2; j < i/2; j++) {
                    if((i%j) == 0) {
                        numberOfFactors++;
                    }
                }

                if (numberOfFactors < 2) {
                    primeFactors.add(i);
                    numberOfFactors = 0;
                } else {
                    numberOfFactors = 0;
                }

            }
        }

        for (Integer factor : primeFactors) {
            if (largestPrimeFactor < factor) {
                largestPrimeFactor = factor;
            }
        }

        System.out.println("Largest Prime Factor : " + largestPrimeFactor);
    }
}
