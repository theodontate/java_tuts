package holding;

import java.util.LinkedList;

/**
 * Created by theartiste on 1/21/16.
 */
public class Stack<T> {
    //LIFO
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}
