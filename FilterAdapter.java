/**
 * Created by theartiste on 1/3/16.
 */
public class FilterAdapter implements Processor {
    private Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    public Waveform process(Object s) {
        return filter.process((Waveform) s);
    }
}
