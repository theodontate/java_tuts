package holding;

import java.util.*;

/**
 * Created by theartiste on 2/1/16.
 */
public class Exer24 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> resultingMap = new LinkedHashMap<>();
        Set<String> set = new TreeSet<>();

        map.put("Zoro", 1);
        map.put("Susan", 2);
        map.put("Linda", 3);
        map.put("Aryan", 4);

        System.out.println(map);

        for (String key : map.keySet()) {
            set.add(key);
        }

        System.out.println("TreeSet : " + set);

        for (String key : set) {
            resultingMap.put(key, map.get(key));
        }

        System.out.println(resultingMap);
    }
}
