/**
 * Created by theartiste on 1/5/16.
 */
public class Dad {
    private int age;

    Dad(int age) {
        this.age = age;
    }

    Dad(DadName a) {
        if (a.getName().matches("Naveen")) {
            age = 12;
        } else {
            age = 89;
        }
    }

    public int getAge() {
        return age;
    }
}
