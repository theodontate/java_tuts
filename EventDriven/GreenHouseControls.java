package EventDriven;

/**
 * Created by theartiste on 1/7/16.
 */
public class GreenHouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = true;
        }

        public String toString() {
            return "Light is on.";
        }
    }


    public class LightOff extends Event {

        public LightOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = false;
        }

        public String toString() {
            return "Light is off.";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            water = true;
        }

        public String toString() {
            return "Water is on";
        }
    }

    public class WaterOff extends Event {

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            water = false;
        }

        public String toString() {
            return "Water is off";
        }
    }

    private String thermostat = "Day";

    public class ThermostatOn extends Event {

        public ThermostatOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            thermostat = "Night";
        }

        public String toString() {
            return "Thermostat on Night setting";
        }
    }

    public class ThermostatOff extends Event {

        public ThermostatOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            thermostat = "Day";
        }

        public String toString() {
            return "Thermostat on Day setting";
        }
    }

    boolean Fans = false;

    public class FansOn extends Event {

        public FansOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            Fans = true;
        }

        public String toString() {
            return "Fans are on.";
        }
    }


    public class FansOff extends Event {

        public FansOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            Fans = false;
        }

        public String toString() {
            return "Fans are off.";
        }
    }

    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }

        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        public String toString() {
            return "Restarting system.";
        }
    }

    public static class Terminate extends Event {

        public Terminate(long delayTime) {
            super(delayTime);
        }

        public void action() {
            System.exit(0);
        }

        public String toString() {
            return "Terminating.";
        }
    }
}
