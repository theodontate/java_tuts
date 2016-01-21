package holding;

/**
 * Created by theartiste on 1/21/16.
 */
public class Exer15 {
    public static void main(String[] args) {
        Stack<Character> awesomeStack = new Stack<Character>();
        char prevC = ' ';

        char[] s = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—".toCharArray();

        for (char c : s) {
            if (prevC == '+') {
//                System.out.println("Debug : if()" + c);
                awesomeStack.push(c);

            } else if (prevC == '-') {
//                System.out.println("Debug : else()" + c);
                System.out.println("result " + awesomeStack.pop());
            }

            prevC = c;
        }

        System.out.println("awesomeness : " + awesomeStack);
    }
}
