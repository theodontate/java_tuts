package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by theartiste on 1/10/16.
 */

class snow {
}

class Powder extends snow {
}

class Light extends snow {
}

class Heavy extends snow {
}

class Crusty extends snow {
}

class Slush extends snow {
}

public class AsListInterference {
    public static void main(String[] args) {
        List<snow> snow1 = Arrays.asList(
                new Crusty(),
                new Slush(),
                new Powder()
        );

        List<snow> snow2 = Arrays.asList(
                new Light(),
                new Heavy()
        );


        List<snow> snow3 = new ArrayList<snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        List<snow> snow4 = Arrays.<snow>asList(
                new Light(),
                new Heavy()
        );
    }
}

