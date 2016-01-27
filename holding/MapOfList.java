package holding;

import petsie.*;
import petsie.Cymric;
import petsie.Pet;

import java.util.*;

/**
 * Created by theartiste on 1/26/16.
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<Person, List<? extends Pet>>();

    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Mike"), Arrays.asList(new Cat("Shackelton"), new Dog("Margarett"), new Cat("Elsie May")));
        petPeople.put(new Person("Marilyn"),
                Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree"),
                        new Cat("Stanford aka Stinky el Negro"),
                        new Cat("Pinkola")
                ));
        petPeople.put(new Person("Luke"), Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"), Arrays.asList(new Rat("Freckly")));
    }

    public static void main(String[] args) {
        System.out.println("People : " + petPeople.keySet());
        System.out.println("Pets : " + petPeople.values());
        for (Person person : petPeople.keySet()) {
            System.out.print(person + " has : ");
            for (Pet pet : petPeople.get(person))
                System.out.print(" " + pet);
            System.out.println();
        }
    }
}
