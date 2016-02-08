package Exceptions;

/**
 * Created by theartiste on 2/8/16.
 */
class BloodyHellException extends Exception {

}

public class FailingConstructor {
    public FailingConstructor() throws BloodyHellException {
        throw new BloodyHellException();
    }

    public FailingConstructor(String s) throws BloodyHellException {

    }

    public void dispose() {
        System.out.println("I am disposed.");
    }

    public static void main(String[] args) {
//        try {
//            FailingConstructor fc = new FailingConstructor();
//            try {
//                //What ever the fuck it might be.
//            } finally {
//                fc.dispose();
//            }
//        } catch (BloodyHellException e) {
//            e.printStackTrace(System.out);
//        }

        try {
            FailingConstructor fc2 = new FailingConstructor("Workship");
            try {
                throw new BloodyHellException();
            } catch (BloodyHellException e) {
                try {
                    FailingConstructor fc3 = new FailingConstructor("Awesome");
                } finally {
                    throw e;
                }
            } finally {
                fc2.dispose();
            }
        } catch (BloodyHellException e) {
            e.printStackTrace(System.out);
        }

    }




}
