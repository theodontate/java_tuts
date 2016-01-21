package holding;

/**
 * Created by theartiste on 1/21/16.
 */
public class StackCollision {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "I love me".split(" ")) {
            stack.push(s);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        java.util.Stack<String> stack2 = new java.util.Stack<>();
        for (String s : "I love me".split(" ")) {
            stack2.push(s);
        }

        while (!stack2.empty()) {
            System.out.print(stack2.pop() + " ");
        }
    }
}
