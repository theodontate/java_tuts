package holding;

import java.util.Map;

/**
 * Created by theartiste on 2/2/16.
 */
public class EnvironmentalVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
