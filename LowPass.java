/**
 * Created by theartiste on 1/3/16.
 */
public class LowPass extends Filter {
    private double cutOff;

    LowPass(double cutOff) {
        this.cutOff = cutOff;
    }

    @Override
    public Waveform process(Waveform w) {
        return w;
    }
}
