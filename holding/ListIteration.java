package holding;

import petsie.Pet;
import petsie.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by theartiste on 1/12/16.
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next() + " : " + it.nextIndex() + ", " + it.previousIndex() + " ; ");
        }

        while (it.hasPrevious()) {
            System.out.print(it.previous().id() + " ");
        }

        System.out.println();
        System.out.println(pets);

        while (it.hasNext()) {
            it.next();
            it.set(Pets.randomPet());
        }

        System.out.println(pets);

    }
}
