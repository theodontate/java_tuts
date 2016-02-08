package Exceptions;

/**
 * Created by theartiste on 2/8/16.
 */
class BloodyHellException extends Exception {

}

class WithDispose {
    private boolean b;

    public WithDispose(boolean b) {
        this.b = b;
    }

    public void dispose() {
        System.out.println("I am disposed.");
    }

    public boolean getB() {
        return this.b;
    }

}

public class FailingConstructor {
    WithDispose wd, wd2;
    public FailingConstructor() throws BloodyHellException {
        wd = new WithDispose(false);
        try {
            if (wd.getB()) {
                throw new BloodyHellException();
            }
        } catch (BloodyHellException e) {
            wd.dispose();
            throw e;
        }
        wd2 = new WithDispose(false);
    }

    public FailingConstructor(String s) throws BloodyHellException {

    }

    public void dispose() {
        wd.dispose();
        wd2.dispose();

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

//        try {
//            FailingConstructor fc2 = new FailingConstructor("Workship");
//            try {
//                throw new BloodyHellException();
//            } catch (BloodyHellException e) {
//                try {
//                    FailingConstructor fc3 = new FailingConstructor("Awesome");
//                } finally {
//                    throw e;
//                }
//            } finally {
//                fc2.dispose();
//            }
//        } catch (BloodyHellException e) {
//            e.printStackTrace(System.out);
//        }

        try {
            FailingConstructor fc = new FailingConstructor();
            try {
                //do whatever the fuck you want to do.
            } finally {
                System.out.println("System cleanup");
                fc.dispose();
            }

        } catch (BloodyHellException e) {
            e.printStackTrace(System.out);

        }



    }




}
