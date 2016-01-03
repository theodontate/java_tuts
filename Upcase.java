/**
 * Created by theartiste on 1/3/16.
 */
public class Upcase extends StringProcessor {

    @Override
    public String process (Object input) {
        return ((String) input).toUpperCase();
    }
}
