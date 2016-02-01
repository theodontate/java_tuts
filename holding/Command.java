package holding;

/**
 * Created by theartiste on 2/1/16.
 */
public class Command {
    private String command;

    public Command(String command) {
        this.command = command;
    }

    public void operation() {
        System.out.println(command);
    }
}
