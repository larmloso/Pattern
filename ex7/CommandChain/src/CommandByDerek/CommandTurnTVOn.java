

public class CommandTurnTVOn implements Command {

    ElectronicDevice theDevice;

    public CommandTurnTVOn(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.on();
    }

    public void undo() {
        theDevice.off();
    }

}
