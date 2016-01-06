package ClassesInsideInterfaces;

/**
 * Created by theartiste on 1/6/16.
 */
public interface Television {

    public void turnOn();

    public void turnOff();

    class Work {

        public static void doSomething(Television v) {
            v.turnOff();
            v.turnOn();
        }

    }
}
