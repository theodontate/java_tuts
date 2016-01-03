/**
 * Created by theartiste on 1/3/16.
 */
public class HighPass extends Filter {
    private double cutOff;

    HighPass(double cutOff) {
        this.cutOff = cutOff;
    }

    public Object process(Object w) {
        return (Waveform) w;
    }
}
