package BridgeMobile;

public class DemoBridgeMobile {
    public static void main(String[] args) {
        Mobile smartPhone = new Smartphone(new UnlockTouch());
        smartPhone.unlock();
        
        Mobile tablet = new Tablet((new UnlockPress()));
        tablet.unlock();
    }
}
