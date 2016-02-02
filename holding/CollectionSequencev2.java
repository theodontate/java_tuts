package holding;

import java.util.Collection;
import java.util.Iterator;

import petsie.Pet;
import petsie.Pets;

/**
 * Created by theartiste on 2/2/16.
 */
public class CollectionSequencev2 implements Collection {
    private Pet[] pets = Pets.createArray(8);


    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Pet[] toArray(Object[] a) {
        return new Pet[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    public static void main(String[] args) {
        CollectionSequence cs = new CollectionSequence();
        InterfaceVsIterator.display(cs);
        InterfaceVsIterator.display(cs.iterator());
    }

}