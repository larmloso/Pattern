package Factory;

public class SmartPhone implements Mobile{
    
    String brand;
    int price;    
    boolean hasBLE;
    
    public SmartPhone(){}
    
    public SmartPhone(String brand, int price, boolean hasBLE){
        this.brand = brand;
        this.price = price;
        this.hasBLE = hasBLE;
    }
    
    public void makeCall(String phoneNumber){
        System.out.println("SmartPhone makes a call to : " + phoneNumber);
    }
    
    public void showInfo(){
        System.out.println(this.brand + ", " + this.price + ", " + this.hasBLE);
    }
    
}
