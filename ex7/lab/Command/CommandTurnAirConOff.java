public class CommandTurnAirConOff implements Command {

    ElectronicDevice theDevice;

    public CommandTurnAirConOff(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.off();
    }

    public void undo() {
        theDevice.on();
    }

}