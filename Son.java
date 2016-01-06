/**
 * Created by theartiste on 1/5/16.
 */
public class Son {

    public Dad becomes(DadName a) {
        return new Dad(a) {

           @Override
            public int getAge() {
               return super.getAge()/2;
           }
        };
    }

    public static void main(String[] args) {
        DadName dadName = new DadName("Naveen");
        Son son = new Son();
        Dad dad = son.becomes(dadName);
        System.out.println(dad.getAge());
    }
}
