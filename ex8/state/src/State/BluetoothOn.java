package State;

public class BluetoothOn implements BluetoothState {

    private final Bluetooth bluetooth;

    public BluetoothOn(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public void connect() {
        System.out.println("Connect...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect...");
        bluetooth.setBluetoothState(bluetooth.getBluetoothConnect());
    }

    @Override
    public void off() {
        bluetooth.setState(bluetooth.getBluetoothOff());
        System.out.println("BluetoothSpeaker is switched off");

    }

}
