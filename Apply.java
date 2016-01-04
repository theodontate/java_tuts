/**
 * Created by theartiste on 1/3/16.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using processor : " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect.";

    public static void main(String[] args) {
        String str = "loved";
        process(new Upcase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);
        process(new SwapChar(), str);
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                process(new LowPass(1.0), new Waveform());
            } else {
                process(new HighPass(1.0), new Waveform());
                process(new BandPass(1.0, 3.4), new Waveform());
            }
        }
    }
}
