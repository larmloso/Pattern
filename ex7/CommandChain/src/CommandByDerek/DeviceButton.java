

// a.k.s the INVOKER
//
public class DeviceButton {

    Command theCommand;

    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }

    // method press() causes the execute method to be called
    public void press() {
        theCommand.execute();
    }

    // Now the remote can undo past commands
    public void pressUndo() {
        theCommand.undo();
    }

}
