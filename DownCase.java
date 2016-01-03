/**
 * Created by theartiste on 1/3/16.
 */
public class DownCase extends Processor {

    @Override
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}
