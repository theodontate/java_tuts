/**
 * Created by theartiste on 1/3/16.
 */
public abstract class Filter implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract Object process(Object input);
}
