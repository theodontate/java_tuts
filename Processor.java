/**
 * Created by theartiste on 1/3/16.
 */
public class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}
