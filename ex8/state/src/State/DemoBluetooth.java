package State;

public class DemoBluetooth {

    public static void main(String[] args) {
        Bluetooth robot = new Bluetooth();
        robot.connect();
        robot.disconnect();
        robot.connect();
        robot.off();

        robot.connect();

    }
}
