package Exceptions;

import java.io.FileInputStream;

/**
 * Created by theartiste on 2/8/16.
 */
public class MainException {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("MainException.java");
        file.close();
    }
}
