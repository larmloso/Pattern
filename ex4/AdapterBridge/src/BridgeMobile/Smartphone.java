package BridgeMobile;

public class Smartphone extends Mobile{

    public Smartphone(Unlockable unlockable) {
        super(unlockable);
    }

    @Override
    public void unlock() {
        System.out.print("Smartphone is ");
        unlockable.unlock();
    }
    
}
