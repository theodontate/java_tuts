/**
 * Created by theartiste on 1/3/16.
 */
public class HighPass extends Filter {
    private double cutOff;

    HighPass(double cutOff) {
        this.cutOff = cutOff;
    }

    @Override
    public Waveform process(Waveform w) {
        return w;
    }
}
