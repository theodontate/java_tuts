package InnerClassesAndCoffee;

/**
 * Created by theartiste on 1/6/16.
 */
public class A {
    private String name;
    private boolean deleted = false;

    A(String name) {
        this.name = name;
    }

    public U makeU() {
        return new U() {
            boolean isDeleted = false;

            public void doA() {
                System.out.println("Inside doA()");
            }

            public void doB() {
                System.out.println("Inside doB()");
            }

            public void setDeleted() {
                isDeleted = true;
            }

            public boolean getDelState() {
                return isDeleted;
            }

        };
    }

    public void setDeleted() {
        deleted = true;
    }

    public boolean getDelState() {
        return deleted;
    }

    public String toString() {
        return name;
    }
}
