package holding;

import petsie.Pet;
import petsie.Pets;
import petsie.Pug;
import petsie.Rat;
import petsie.Hamster;

import java.util.LinkedList;

/**
 * Created by theartiste on 1/21/16.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        System.out.println(pets);
        System.out.println("pets.getFirst() : " + pets.getFirst());
        System.out.println("pets.element() : " + pets.element());
        System.out.println("pets.peek() : " + pets.peek());
        System.out.println("pets.poll() : " + pets.poll());
        System.out.println("pets.remove() : " + pets.remove());
        System.out.println("pets.removeFirst() : " + pets.removeFirst());
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("After addFirst() : " + pets);
        pets.offer(new Pug());
        System.out.println("After offer() : " + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast() : " + pets);
        System.out.println("After removeLast() : " + pets.removeLast());
    }
}
