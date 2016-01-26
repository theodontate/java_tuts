package holding;

import petsie.*;
import petsie.Hamster;
import petsie.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by theartiste on 1/26/16.
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Dinger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        System.out.println(petMap.containsKey("My Dog"));
        Pet dog = petMap.get("My Dog");
        System.out.println(petMap.containsValue(dog));
        System.out.println("Program terminating.");

    }
}
