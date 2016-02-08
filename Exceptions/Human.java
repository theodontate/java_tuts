package Exceptions;

/**
 * Created by theartiste on 2/8/16.
 */
class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

class HumanIt {
    public void throwExceptionIt(int type) {
        try {

            switch (type) {
                case 0:
                    throw new Sneeze();
                case 1:
                    throw new Annoyance();
                default:
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class Human {
    public static void main(String[] args) {
        HumanIt hi = new HumanIt();
        for (int i  = 0; i < 2; i++) {
            try {
                hi.throwExceptionIt(i);
            } catch (RuntimeException e) {
                try {
                    throw e.getCause();
                } catch (Sneeze b) {
                    System.out.println("Caught Sneeze.");
                } catch (Annoyance a) {
                    System.out.println("Caught Annoyance");
                } catch (Throwable re) {
                    re.printStackTrace();
                }
            }

        }
    }
}
