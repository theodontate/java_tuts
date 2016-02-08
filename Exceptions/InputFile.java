package Exceptions;

/**
 * Created by theartiste on 2/8/16.
 */

import java.io.*;

public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't open " + fname);
            throw e;
        } catch (Exception e) {
            //All other exceptions must close it
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close() unsuccessful.");
            }
            throw e;
        } finally {
            //Don't close it here.
        }
    }

    public String getLine() {
        String s;

        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }

        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful.");
        } catch (IOException e) {
            throw new RuntimeException("in.close() failed.");
        }
    }
    }
