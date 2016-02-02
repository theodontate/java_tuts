package holding;

import java.util.PriorityQueue;

/**
 * Created by theartiste on 2/1/16.
 */
public class SimpleObjectDemo {
    public static void main(String[] args) {
        PriorityQueue<simpleObject> sPQ = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            sPQ.offer(new simpleObject());
        }
    }
}
