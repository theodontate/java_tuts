import java.util.Arrays;

/**
 * Created by theartiste on 1/3/16.
 */
public class Splitter extends StringProcessor {

    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
