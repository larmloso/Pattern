

public class CommandTurnTVUp implements Command {

    ElectronicDevice theDevice;

    public CommandTurnTVUp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.volumeUp();
    }

    public void undo() {
        theDevice.volumenDown();
    }

}
