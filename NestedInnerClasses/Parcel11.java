package NestedInnerClasses;

import InnerClasses.Contents;
import InnerClasses.Destination;

/**
 * Created by theartiste on 1/6/16.
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int value;

        public int value() {
            return value;
        }
    }

    protected static class ParcelDestination implements Destination {
        String label;

        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }

        public static void f() {
        }

        static int x = 10;

        static class Anotherlevel {
            public static void f() {
            }

            static int x = 10;

        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

}
