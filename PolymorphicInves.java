/**
 * Created by theartiste on 1/6/16.
 */
public class PolymorphicInves extends PolymorphicEntropy {
    private int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.getField();
    }

}
