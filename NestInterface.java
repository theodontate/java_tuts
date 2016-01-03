/**
 * Created by theartiste on 1/3/16.
 */
public class NestInterface {
    interface B {
        void f();
    }

    public class BImp implements B {
        public void f() {
        }
    }

    private class BImp2 implements B {
        public void f() {
        }
    }

    public interface C {
        void f();
    }

    class CImp implements C {
        public void f() {
        }
    }

    private interface D {
        void f();
    }

    private class DImp implements D {
        public void f() {
        }
    }

    private interface K {
        void f();
    }

    private class KImp implements K {
        public void f() {

        }
    }

    public D getD() {
        return new DImp();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }

    interface E {
        interface G {
            void f();
        }

        public interface H {
            void f();
        }

        void g();
    }
}
