package State;

public class BluetoothConnect implements BluetoothState {

    private final Bluetooth bluetooth;

    public BluetoothConnect(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public void connect() {
        System.out.println("Connect...");
        bluetooth.setBluetoothState(bluetooth.getBluetoothOn());
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect...");
    }

    @Override
    public void off() {
        System.out.println("Cannot switched off while connect...");
    }
}
