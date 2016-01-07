package EventDriven;

/**
 * Created by theartiste on 1/7/16.
 */
public class GreenHouseController {
    public static void main(String[] args) {
        GreenHouseControls gc = new GreenHouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
            gc.new ThermostatOff(200),
                gc.new LightOn(200),
                gc.new LightOff(300),
                gc.new WaterOn(400),
                gc.new WaterOff(500),
                gc.new ThermostatOn(200),
                gc.new FansOn(100),
                gc.new FansOff(300)
        };

        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(
                    new GreenHouseControls.Terminate(
                            new Integer(args[0])
                    )
            );
        }

        gc.run();
    }
}
