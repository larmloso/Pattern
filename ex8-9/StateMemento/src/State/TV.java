package State;

public class TV implements State {

    private State tvOn;
    private State tvOff;
    private State state;

    public TV() {
        this.tvOn = new TVOnState(this);
        this.tvOff = new TVOffState(this);
        this.state = tvOn;
    }

    @Override
    public void turnOn() {
        state.turnOn();
    }

    @Override
    public void turnOff() {
        state.turnOff();
    }
    
    public State getTvOn() {
        return tvOn;
    }

    public void setTvOn(State tvOn) {
        this.tvOn = tvOn;
    }

    public State getTvOff() {
        return tvOff;
    }

    public void setTvOff(State tvOff) {
        this.tvOff = tvOff;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
