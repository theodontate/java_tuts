package InnerClasses;

/**
 * Created by theartiste on 1/4/16.
 */
public class sequence {
    private Object[] items;
    private int next = 0;

    public sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        items[next++] = x;
    }

    private class sequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
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

        while(!strSequenceSelector.end()) {
            System.out.println(strSequenceSelector.current());
            strSequenceSelector.next();
        }

        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }

        System.out.println(sHolder);
    }
}
