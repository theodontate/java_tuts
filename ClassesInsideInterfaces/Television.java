package ClassesInsideInterfaces;

/**
 * Created by theartiste on 1/6/16.
 */
public interface Television {

    public void turnOn();

    public void turnOff();

    class Work implements Television {

        public void turnOn() {
            System.out.println("Television turning on.");
        }

        public void turnOff() {
            System.out.println("Television switched off.");
        }
    }
}
