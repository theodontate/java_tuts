package Creation;

/**
 * Created by theartiste on 1/6/16.
 */
public class Computer {
    public Keyboard getKeyboard(String n) {
        return new Keyboard(n) {

            @Override
            public String getName() {
                String mName = super.getName();
                return "My Name is " + mName;
            }
        };
    }

    public Keyboard getKeyboard() {
        return new Keyboard() {

            @Override
            public String getName() {
                String mName = super.getName();
                return "My Name is " + mName;
            }
        };
    }
}
