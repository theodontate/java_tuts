package InnerClasses.InnerDemo;

import InnerClasses.InnerDepth.Interface1;
import InnerClasses.InnerShade.Cards;

/**
 * Created by theartiste on 1/4/16.
 */
public class Indie extends Cards {

    public Interface1 doShit() {
        return this.new PlayItCool();
    }
}
