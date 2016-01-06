/**
 * Created by theartiste on 1/5/16.
 */
public class StarMen2 {

    private class GreenLantern implements StarMen {
        String name = "Green Lantern";

        public void beDetermined() {
            System.out.println("I am green.");
        }
    }

    public GreenLantern checkItOut() {
        return new GreenLantern();
    }

}
