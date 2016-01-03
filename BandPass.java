/**
 * Created by theartiste on 1/3/16.
 */
public class BandPass extends Filter {
    private double HighCutOff, LowCutOff;

    BandPass(double HighCutOff, double LowCutOff) {
        this.HighCutOff = HighCutOff;
        this.LowCutOff = LowCutOff;
    }

    @Override
    public Waveform process(Waveform w) {
        return w;
    }
}
