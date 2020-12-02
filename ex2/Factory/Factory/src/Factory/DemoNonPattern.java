package Factory;

/*
Class DemoNonPattern
author: Wasana Ngaogate
obj: to demonstrat how to create objects without using Factory patern
*/
public class DemoNonPattern {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.brand = "Asus";
        sm.price = 3000;
        sm.hasBLE = true;
        sm.showInfo();
        
        Tablet tl = new Tablet();
        tl.brand = "Samsung";
        tl.price = 5000;
        tl.showInfo();
    }
}
