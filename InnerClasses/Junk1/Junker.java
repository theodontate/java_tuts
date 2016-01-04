package InnerClasses.Junk1;

import InnerClasses.Junk.Junkie;

/**
 * Created by theartiste on 1/4/16.
 */
public class Junker extends Junkie {

    public Love doSomeShit() {
        return this.new Love(1);
    }
}
