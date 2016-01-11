package holding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by theartiste on 1/11/16.
 */
public class AClassDemo {
    public static void main(String[] args) {
        List<AClass> aClasses = new ArrayList<AClass>();
        List<AClass> subClass;

        for (int i = 0; i < 10; i++) {
            aClasses.add(new AClass(i + "th"));
        }

        System.out.println(aClasses);

        subClass = aClasses.subList(0, 4);

        aClasses.removeAll(subClass);

        System.out.println("After removal : ");

        System.out.println(aClasses);

        System.out.println("iteration : ");

        Iterator<AClass> i = aClasses.iterator();

        while(i.hasNext()) {
            AClass temp = i.next();
            if (temp.getName().matches("4th")) {
                i.remove();
            }
        }

        System.out.println("Debug : ");
        for (AClass t : aClasses) {
            System.out.println(t);
        }

    }
}
