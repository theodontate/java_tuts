package Factories;

/**
 * Created by theartiste on 1/3/16.
 */
public class ImplementationFactory2 implements ServiceFactory {

    public Service getService() {
        return new Implementation2();
    }

}
