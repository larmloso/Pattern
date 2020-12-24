package BridgeMobile;

public abstract class Mobile {

    protected Unlockable unlockable;

    public Mobile(Unlockable unlockable) {
        this.unlockable = unlockable;
    }

    abstract public void unlock();
    
}
