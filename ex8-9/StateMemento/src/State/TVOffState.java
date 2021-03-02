package State;

public class TVOffState implements State {

    private final TV tv;

    public TVOffState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void turnOn() {
        tv.setState(tv.getTvOn());
        System.out.println("Turning on TV...");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is already off.");
    }
}
