package Factory;

/*
Class DemoPattern
author: Wasana Ngaogate
obj: to demonstrat how to create objects with Factory patern
*/
public class DemoPattern {
    public static void main(String[] args) {
        Mobile smartPhone = MobileFactory.createMobile(Mobile.SmartPhone);
        smartPhone.showInfo();
        Mobile tablet = MobileFactory.createMobile(Mobile.Tablet);
        tablet.showInfo();
    }
}
