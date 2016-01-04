/**
 * Created by theartiste on 1/3/16.
 */
public class LowPass extends Filter {
    private double cutOff;

    LowPass(double cutOff) {
        this.cutOff = cutOff;
    }

    public Object process(Object w) {
        return ((Waveform) w);
    }
}
