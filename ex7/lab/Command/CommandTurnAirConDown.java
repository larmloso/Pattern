public class CommandTurnAirConDown implements Command {

    ElectronicDevice theDevice;

    public CommandTurnAirConDown(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.volumenDown();
    }

    public void undo() {
        theDevice.volumeUp();
    }

}