package DarkCorners;

/**
 * Created by theartiste on 2/8/16.
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            //Using return inside a finally block will silence any thrown exception.
            return;
        }
    }
}
