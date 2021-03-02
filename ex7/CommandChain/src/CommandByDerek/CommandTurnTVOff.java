

public class CommandTurnTVOff implements Command {

    ElectronicDevice theDevice;

    public CommandTurnTVOff(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.off();
    }

    public void undo() {
        theDevice.on();
    }

}
