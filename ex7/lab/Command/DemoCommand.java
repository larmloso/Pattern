class DemoCommand {
    public static void main(String[] args) {

        ElectronicDevice newDevice = AirConRemote.getDevice();
        
        CommandTurnAirConOn turnAirConOnCommand = new CommandTurnAirConOn(newDevice);
        
        DeviceButton onPressed = new DeviceButton(turnAirConOnCommand);
        onPressed.press();


        CommandTurnAirConSetVol setvolCommand = new CommandTurnAirConSetVol(newDevice, 25);
        onPressed = new DeviceButton(setvolCommand);
        onPressed.press();


        CommandTurnAirConUp volUpCommand = new CommandTurnAirConUp(newDevice);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.pressUndo();
        onPressed.pressUndo();

        CommandTurnAirConDown volDownCommand = new CommandTurnAirConDown(newDevice);
        onPressed = new DeviceButton(volDownCommand);
        onPressed.press();

        CommandTurnAirConOff turnOff = new CommandTurnAirConOff(newDevice);
        onPressed = new DeviceButton(turnOff);
        onPressed.press();

    }
}

