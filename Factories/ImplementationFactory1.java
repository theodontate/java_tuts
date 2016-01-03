package Factories;

/**
 * Created by theartiste on 1/3/16.
 */
public class ImplementationFactory1 implements ServiceFactory {

    ImplementationFactory1() {
    }

    public Service getService() {
        return new Implementation1();
    }


}
