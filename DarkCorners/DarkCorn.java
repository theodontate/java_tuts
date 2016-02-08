package DarkCorners;

/**
 * Created by theartiste on 2/8/16.
 */
class VeryImportantException extends Exception {
    public String toString() {
        return "A Very Important Exception.";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial Exception";
    }
}

class BSException extends Exception {
    public String toString() {
        return "A bull-shitty exception.";
    }
}

public class DarkCorn {
    public void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    public void g() throws HoHumException {
        throw new HoHumException();
    }

    public void h() throws BSException {
        throw new BSException();
    }

    public static void main(String[] args) {
        try {
            DarkCorn dc = new DarkCorn();
            try {
                dc.f();
            } finally {
                try {
                    dc.g();

                } finally {
                   dc.h();
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
