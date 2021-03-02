package State;

public class BluetoothOff implements BluetoothState {

    private final Bluetooth bluetooth;

    public BluetoothOff(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public void connect() {
        System.out.println("cannot connect at Off state.");
        bluetooth.setBluetoothState(bluetooth.getBluetoothOn());
    }

    @Override
    public void disconnect() {
        System.out.println("Cannot connect at Off state.");
    }

    @Override
    public void off() {
        System.out.println("Already switched off...");
    }
}
