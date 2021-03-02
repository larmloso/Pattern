public class CommandTurnAirConOn implements Command {

    ElectronicDevice theDevice;

    public CommandTurnAirConOn(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.on();
    }

    public void undo() {
        theDevice.off();
    }

}