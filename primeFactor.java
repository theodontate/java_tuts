/**
 * Created by theartiste on 1/4/16.
 */
public class primeFactor {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        boolean isPrime = true;
        int numberOfFactors = 0;
        long largestPrimeFactor = 1;
        long theNumber = 34567234;
        long bound = (long) Math.sqrt(theNumber);
        for (int i = 1; i <= bound; i++) {
            if ((theNumber%i) == 0) {
                System.out.println("factor : " + i);
                for (int j = 2; j < i/2; j++) {
                    if ((i%j) == 0) {
                        System.out.println("composite factor : " + i);
                        isPrime = false;
                        break;
                    }
                }
                System.out.println(isPrime);
                if(isPrime) {
                    if (i > largestPrimeFactor) largestPrimeFactor = i;
                }
                isPrime = true;
            }
        }

        System.out.println("The largest prime factor of " + theNumber + " is " + largestPrimeFactor);
        long endTime = System.currentTimeMillis();
        System.out.println("took " + (endTime - startTime) + " millisec.");
    }
}
