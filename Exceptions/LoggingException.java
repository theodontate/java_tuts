package Exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by theartiste on 2/2/16.
 */

class LogginException extends Exception {
    private static Logger logger = Logger.getLogger("LogginException");


    public LogginException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public LogginException(String name) {
        super(name);
    }
}



public class LoggingException {
    public static void main(String[] args) {
        try {
            throw new LogginException();
        } catch (LogginException e) {
            System.err.println("Caught " + e);
        }

        try {
            throw new LogginException();
        } catch (LogginException e) {
            System.err.println("Caught " + e);
        }
    }

}
