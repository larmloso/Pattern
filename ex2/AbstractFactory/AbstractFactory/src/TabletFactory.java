

public class TabletFactory implements MobileAbstractFactory{

    String brand;
    int price;  
    
    public TabletFactory(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    
    @Override
    public Tablet createMobile() {
        return new Tablet(this.brand, this.price);
    }
    
}
