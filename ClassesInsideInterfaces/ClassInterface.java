package ClassesInsideInterfaces;

/**
 * Created by theartiste on 1/6/16.
 */
public interface ClassInterface {
    void howdy();

    class Test implements ClassInterface {

        public void howdy() {
            System.out.println("Howdy bro ?");
        }
    }

    public static void main(String[] args) {
        new Test().howdy();
    }
}
