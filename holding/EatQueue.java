package holding;

import java.util.Queue;

/**
 * Created by theartiste on 2/1/16.
 */
public class EatQueue {
    public static void doIt(Queue queue) {
        while (queue.peek() != null) {
            Command command = (Command) queue.poll();
            command.operation();
        }
    }
}
