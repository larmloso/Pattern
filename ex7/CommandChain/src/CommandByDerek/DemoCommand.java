

public class DemoCommand {

    public static void main(String[] args) {
        

        ElectronicDevice newDevice = TVRemote.getDevice();
        
        CommandTurnTVOn turnTVOnCommand = new CommandTurnTVOn(newDevice);
        
        DeviceButton onPressed = new DeviceButton(turnTVOnCommand);
        onPressed.press();

        CommandTurnTVUp volUpCommand = new CommandTurnTVUp(newDevice);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();
    }
    
}
