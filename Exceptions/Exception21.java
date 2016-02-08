package Exceptions;

/**
 * Created by theartiste on 2/8/16.
 */
class BSODException extends Exception {}

class NoDisplayException extends Exception {}


class Desktop {
    public Desktop() throws BSODException {
        throw new BSODException();
    }
}

class Server extends Desktop {
    public Server() throws BSODException {

    }

}
public class Exception21 {
    public static void main(String[] args) {
        try {
            Server s = new Server();
        } catch (BSODException e) {
            e.printStackTrace(System.out);
        }
    }


}
