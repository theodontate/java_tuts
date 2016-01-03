import java.util.ArrayList;

/**
 * Created by theartiste on 1/4/16.
 */
public class primeFac {
    public static void main(String[] args) {
        ArrayList<Long> primeFactors = new ArrayList<>();
        long theNumber = 600851475143L;
        long bound = theNumber/2L;
        long largestPrimeFactor = 1;

        System.out.println(theNumber);
        System.out.println("bound : " + bound);

//        for (long i = 1L; i < bound; i++) {
//            if ((i%2) == 0) {
//                primeFactors.add(i);
//                System.out.println(i);
//            }
//        }
//
//        for (Long factor : primeFactors) {
//            if (largestPrimeFactor < factor) {
//                largestPrimeFactor = factor;
//                System.out.println(largestPrimeFactor);
//            }
//        }

        System.out.println("Largest Prime Factor : " + largestPrimeFactor);
    }
}
