package Exceptions;

/**
 * Created by theartiste on 2/2/16.
 */

class Exception1 extends Exception {
    public Exception1() {

    }

    public Exception1(String msg) {
        super(msg);
    }
}


class Exception2 extends Exception {
    public Exception2() {

    }

    public Exception2(String msg) {
        super(msg);
    }
}

class Exception3 extends Exception {
    public Exception3() {

    }

    public Exception3(String msg) {
        super(msg);
    }
}

public class Exer9 {
    private static int index = 0;
    public static void g() throws Exception1, Exception2, Exception3 {
        index++;
        if (index == 1) throw new Exception1();
        else if (index == 2) throw new Exception2();
        else if (index == 3) throw new Exception3();
    }



    public static void main(String[] args) {

        while(index < 4) {
            try {
                System.out.println("index : " + index);
                g();
            } catch (Exception e) {
                e.printStackTrace(System.out);
            } finally {
                System.out.println("Carrots are cooked.");
            }
        }
    }

}
