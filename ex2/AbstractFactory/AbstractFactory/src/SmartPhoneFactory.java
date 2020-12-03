

public class SmartPhoneFactory implements MobileAbstractFactory{

    String brand;
    int price;    
    boolean hasBLE;
    
    public SmartPhoneFactory(String brand, int price, boolean hasBLE){
        this.brand = brand;
        this.price = price;
        this.hasBLE = hasBLE;
    }
        
    @Override
    public SmartPhone createMobile() {
        return new SmartPhone(this.brand, this.price, this.hasBLE);
    }
    
}
