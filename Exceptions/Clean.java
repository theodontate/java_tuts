package Exceptions;

/**
 * Created by theartiste on 2/8/16.
 */
public class Clean {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Clean.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null) {
                    System.out.println(i++ + " " + s);
                }
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

}
