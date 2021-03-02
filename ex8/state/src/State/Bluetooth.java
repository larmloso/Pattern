package State;

public class Bluetooth implements BluetoothState {

    private BluetoothState bluetoothOn;
    private BluetoothState bluetoothConnect;
    private BluetoothState bluetoothOff;

    private BluetoothState state;

    public Bluetooth() {
        this.bluetoothOn = new BluetoothOn(this);
        this.bluetoothConnect = new BluetoothConnect(this);
        this.bluetoothOff = new BluetoothOff(this);

        this.state = bluetoothOn;
    }

    public void setBluetoothState(BluetoothState state) {
        this.state = state;
    }

    @Override
    public void connect() {
        state.connect();
    }

    @Override
    public void disconnect() {
        state.disconnect();
    }

    @Override
    public void off() {
        state.off();
    }

    public BluetoothState getBluetoothOn() {
        return bluetoothOn;
    }

    public void setBluetoothOn(BluetoothState bluetoothOn) {
        this.bluetoothOn = bluetoothOn;
    }

    public BluetoothState getBluetoothConnect() {
        return bluetoothConnect;
    }

    public void setBluetoothConnect(BluetoothState bluetoothConnect) {
        this.bluetoothConnect = bluetoothConnect;
    }

    public BluetoothState getBluetoothOff() {
        return bluetoothOff;
    }

    public void setBluetoothOff(BluetoothState bluetoothOff) {
        this.bluetoothOff = bluetoothOff;
    }

    public BluetoothState getState() {
        return state;
    }

    public void setState(BluetoothState state) {
        this.state = state;
    }

}
