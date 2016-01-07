/**
 * Created by theartiste on 1/7/16.
 */
public class Inner2 {

//    Inner2(Outer ou) {
//        ou.super();
//    }

    public class Inner3 extends Outer.Inner {

        Inner3(Outer ou) {
            ou.super();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer(1,2);
        Inner2 obj = new Inner2();
        Inner3 obj3 = obj.new Inner3(outer);
    }
}
