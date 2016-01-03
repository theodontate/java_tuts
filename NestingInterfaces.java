/**
 * Created by theartiste on 1/3/16.
 */
public class NestingInterfaces {
    public class BImp implements NestInterface.B {
        public void f()  {
        }
    }

    class CImp implements NestInterface.C {
        public void f() {
        }
    }

    class EImp implements NestInterface.E {
        public void g()  {
        }

        class EG implements NestInterface.E.G {
            public void f() {
            }
        }
    }

    public static void main(String[] args) {
        NestInterface a = new NestInterface();
    }
}
