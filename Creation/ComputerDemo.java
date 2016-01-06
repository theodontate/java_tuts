package Creation;

/**
 * Created by theartiste on 1/6/16.
 */
public class ComputerDemo {
    public static void main(String[] args) {
        String name = "WASD";
        Computer cObj = new Computer();
        Keyboard kObj = cObj.getKeyboard();
        System.out.println(kObj.getName());
        Computer cObj2 = new Computer();
        Keyboard kObj2 = cObj2.getKeyboard(name);
        System.out.println(kObj2.getName());
    }
}
