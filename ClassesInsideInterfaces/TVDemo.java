package ClassesInsideInterfaces;

/**
 * Created by theartiste on 1/6/16.
 */
public class TVDemo {
    public static void main(String[] args) {

        Sony sony = new Sony();
        sony.turnOff();
        sony.turnOn();
        Television.Work.doSomething(sony);

    }



}
