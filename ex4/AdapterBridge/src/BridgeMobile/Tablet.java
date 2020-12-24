package BridgeMobile;

public class Tablet extends Mobile{

    public Tablet(Unlockable unlockable) {
        super(unlockable);
    }

    @Override
    public void unlock() {
        System.out.print("Tablet is ");
        unlockable.unlock();
    }
    
}
