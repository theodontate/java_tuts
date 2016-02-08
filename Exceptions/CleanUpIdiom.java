package Exceptions;

/**
 * Created by theartiste on 2/8/16.
 */
//Each disposable object must be followed by a try-finally
class NeedsCleanUp {
    private static long counter = 1;
    private final long id = counter++;

    public void dispose() {
        System.out.println("NeedsCleanUp " + id + " disposed.");
    }

    public void doShit() throws BSException {
        throw new BSException();
    }
}

class ConstructionException extends Exception {

}

class BSException extends Exception {

}

class NeedsCleanUp2 extends NeedsCleanUp {
    public NeedsCleanUp2() throws ConstructionException {

    }

}

public class CleanUpIdiom {
    public static void main(String[] args) {
        NeedsCleanUp nc1 = new NeedsCleanUp();
        try {

        } finally {
            nc1.dispose();
        }

        //Section 2 :
        //If construction can't fail, you can group objects
        NeedsCleanUp nc2 = new NeedsCleanUp();
        NeedsCleanUp nc3 = new NeedsCleanUp();

        try {

        } finally {
            nc2.dispose();
            nc3.dispose();
        }

        //Section 3 :
        //If construction can fail you must guard each one :
        try {
            NeedsCleanUp2 nc4 = new NeedsCleanUp2();
            try {
                NeedsCleanUp2 nc5 = new NeedsCleanUp2();
                try {
                    nc5.doShit();
                } catch (BSException e) {
                    e.printStackTrace(System.out);

                } finally {
                    nc5.dispose();
                }
            } finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) {
            e.printStackTrace(System.out);
        }
    }

}
