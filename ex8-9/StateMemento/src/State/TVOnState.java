package State;

public class TVOnState implements State {

    private final TV tv;

    public TVOnState(TV tv) {
        this.tv = tv;
    }    
    
    @Override
    public void turnOn() {
        System.out.println("TV is already on.");
    }
    
    @Override
    public void turnOff() {
        tv.setState(tv.getTvOff());
        System.out.println("Turning off TV...");
    }

}
