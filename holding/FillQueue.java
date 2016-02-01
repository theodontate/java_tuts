package holding;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by theartiste on 2/1/16.
 */
public class FillQueue {
    private Queue<Command> queue;

    public FillQueue() {
        queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(new Command(i + " th"));
        }
    }

    public Queue getQueue() {
        return this.queue;
    }
}
