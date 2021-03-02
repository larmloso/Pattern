public class CommandTurnAirConUp implements Command {

    ElectronicDevice theDevice;

    public CommandTurnAirConUp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.volumeUp();
    }

    public void undo() {
        theDevice.volumenDown();
    }

}