public class CommandTurnAirConSetVol implements Command {

    ElectronicDevice theDevice;
    int volume;

    public CommandTurnAirConSetVol(ElectronicDevice newDevice, int volume) {
        theDevice = newDevice;
        this.volume = volume;
    }

    public void execute() {
        theDevice.setvolume(this.volume);
    }

    public void undo() {
        theDevice.volumenDown();
    }

}