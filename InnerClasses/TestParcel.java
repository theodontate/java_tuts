package InnerClasses;

/**
 * Created by theartiste on 1/4/16.
 */
public class TestParcel {
    private class PContents implements InnerClasses.Contents {
        private int i = 11;

        public int value() {
           return i;
        }
    }

    protected class PDestination implements InnerClasses.Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }

}
