package Factory;

public class Tablet implements Mobile {
    
    String brand;
    int price;  
    
    public Tablet(){}
    
    public Tablet(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    
    public void makeCall(String phoneNumber) {
        System.out.println("Tablet makes a call to : " + phoneNumber);
    }
    
    public void showInfo(){
        System.out.println(this.brand + ", " + this.price);
    }
}
