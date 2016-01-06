/**
 * Created by theartiste on 1/5/16.
 */
public class Migraine {

    public HeightenedHit migraineHit() {
        return new HeightenedHit() {

            @Override
            public void showMe() {
                System.out.println("I am a badass.");
            }
        };
    }

    public static void main(String[] args) {
        Migraine obj = new Migraine();
        HeightenedHit obj1 = obj.migraineHit();
        obj1.showMe();
    }
}
