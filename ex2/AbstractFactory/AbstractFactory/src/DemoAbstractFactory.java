

/*
Class DemoAbstractFactory
author: Wasana Ngaogate
obj: to demonstrat how to create objects with AbstractFactory patern
*/
public class DemoAbstractFactory {
    public static void main(String[] args) {
        Mobile smartPhone = MobileFactory.createMobile(new SmartPhoneFactory("Asus", 3000, true));
        smartPhone.showInfo();
        
        Mobile tablet = MobileFactory.createMobile(new TabletFactory("Samsung", 5000));
        tablet.showInfo();
    }
    
}
