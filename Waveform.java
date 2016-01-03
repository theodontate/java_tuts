/**
 * Created by theartiste on 1/3/16.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Waveform " + id;
    }
}
