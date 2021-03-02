package State;

public class DemoTV {

    public static void main(String[] args) {        
        TV tv = new TV();
        tv.turnOn();
        tv.turnOff();
        tv.turnOn();
        tv.turnOn();
        tv.turnOff();
    }
}
