package holding;

/**
 * Created by theartiste on 2/2/16.
 */

import petsie.Pet;
import petsie.Pets;

import java.util.*;

class PetSequence2 {
    public static Pet[] pets2 = Pets.createArray(8);

}

public class NonCollectionSequenceV2 implements Iterable<Pet> {

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < PetSequence2.pets2.length;
            }

            public Pet next() {
                return PetSequence2.pets2[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

        };
    }

    public Iterator<Pet> reversed() {
        return new Iterator<Pet>() {
            private int current = PetSequence2.pets2.length - 1;

            public boolean hasNext() {
                return current > -1;
            }

            public Pet next() {
                return PetSequence2.pets2[current--];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

        };
    }

    public Iterator<Pet> randomized() {
        ArrayList<Pet> list = new ArrayList<>(Arrays.asList(PetSequence2.pets2));
        Collections.shuffle(list, new Random(47));
        return list.iterator();
    }

    public static void main(String[] args) {
        NonCollectionSequenceV2 ncV2 = new NonCollectionSequenceV2();
        System.out.println("Iterator()");
        InterfaceVsIterator.display(ncV2.iterator());
        System.out.println("Reversed()");
        InterfaceVsIterator.display(ncV2.reversed());
        System.out.println("Randomized()");
        InterfaceVsIterator.display(ncV2.randomized());

    }

}
