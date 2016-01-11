package InnerClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by theartiste on 1/4/16.
 */
public class sequence {
    private ArrayList items;
    private int next = 0;

    public sequence(int size) {
        items = new ArrayList();
    }

    public void add(Object x) {
        items.add(x);
    }

    private class sequenceSelector implements Selector {
        private Iterator it = items.iterator();


        @Override
        public Object next() {
            return it.next();
        }

        @Override
        public boolean hasNextValue() {
            return it.hasNext();
        }

        public sequence getSequence() {
            return sequence.this;
        }
    }

    private class reverseSelector implements Selector {
        ListIterator rit = items.listIterator(items.size());


        @Override
        public Object next() {
            return rit.previous();
        }

        @Override
        public boolean hasNextValue() {
            return rit.hasPrevious();
        }

        public sequence getSequence() {
            return sequence.this;
        }
    }

    public Selector selector() {
        return new sequenceSelector();
    }

    private class StringHolder {
        private String str;

        StringHolder(String str) {
            this.str = str;
        }

        public String toString() {
            return str;
        }
    }

    public StringHolder getStringHolder(String str) {
        return new StringHolder(str);
    }

    public static void main(String[] args) {
        sequence sequence = new sequence(10);
        sequence strSequence = new sequence(10);
        sequence testSequence = new sequence(5);
        StringHolder sHolder = testSequence.new StringHolder("catie");
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        for (int i = 0; i < 10; i++) {
            strSequence.add(strSequence.getStringHolder(i + " th awesomeness."));
        }

        Selector strSequenceSelector = strSequence.selector();
        while (strSequenceSelector.hasNextValue()) {
            System.out.println(strSequenceSelector.next());
        }
        Selector selector = sequence.selector();
        while (selector.hasNextValue()) {
            System.out.println(selector.next());
        }
        sequence evenCooler = new sequence(10);
        for (int i = 0; i < 10; i++) {
            evenCooler.add(Integer.toString(i));
        }
        Selector ReverseSelector = sequence.new reverseSelector();
        while (ReverseSelector.hasNextValue()) {
            System.out.println(ReverseSelector.next() + " reversing...");
        }

        Selector theReverseSel = evenCooler.new reverseSelector();
        while (theReverseSel.hasNextValue()) {
            System.out.println(theReverseSel.next() + " reseting...");
        }
//
        System.out.println(sHolder);
    }
}
