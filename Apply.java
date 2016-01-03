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
        process(new Upcase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);
    }
}
