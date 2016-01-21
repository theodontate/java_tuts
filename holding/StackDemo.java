package holding;

/**
 * Created by theartiste on 1/21/16.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String s : "I won\'t be long".split(" ")) {
            stack.push(s);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nProgram terminating.");

    }
}
