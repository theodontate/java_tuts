package holding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by theartiste on 1/27/16.
 */
public class exer18 {
    public static void main(String[] args) {
        Map<String, Integer> theMap = new HashMap<>();
        Map<String, Integer> LinkMap = new LinkedHashMap<>();
        theMap.put("Love", 1);
        theMap.put("Cool", 2);
        theMap.put("Science", 3);
        theMap.put("Code", 4);
        theMap.put("Persistence", 5);

        for (String temp : theMap.keySet()) {
            System.out.print(temp + " : " + theMap.get(temp) + "\n");
            LinkMap.put(temp, theMap.get(temp));
        }

        System.out.println("Linked Hash Map : ");
        System.out.println(LinkMap);

    }
}
