/**
 * Created by theartiste on 1/6/16.
 */
public class PolymorphicInvesDemo {
    public static void main(String[] args) {
        PolymorphicEntropy PEObj = new PolymorphicEntropy();
        PolymorphicInves PIObj = new PolymorphicInves();
        System.out.println("this.field : " + PIObj.getField());
        System.out.println("super.field : " + PIObj.getSuperField());
    }
}
