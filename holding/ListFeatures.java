package holding;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by theartiste on 1/10/16.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> Petss = Pets.arrayList(7);
        System.out.println("1 : " + Petss);
        Hamster h = new Hamster("hamster1");
        Petss.add(h);
        System.out.println("2 : " + Petss);
        System.out.println("3 : " + Petss.contains(h));
        Petss.remove(h);
        System.out.println("4 : " + Petss.get(6));
        Pet p = Petss.get(3);
        System.out.println("5 : " + p + " " + Petss.indexOf(p));
        Pet cymric = new Cymric("cymric1");
        Petss.add(cymric);
        System.out.println("6 : " + Petss.indexOf(cymric));
        System.out.println("7 : " + Petss);
        System.out.println("8 : " + Petss.remove(cymric));
        // Must be the exact object :
        System.out.println("9 : " + Petss.remove(p));
        System.out.println("10 : " + Petss);
        List<Pet> sub = Petss.subList(1,4);
        System.out.println("11 : sub List : " + sub);
        System.out.println("12 : " + Petss.containsAll(sub));
//        Collections.sort(sub);










    }
}
