

public class Mobile {
    
    // main attributes
    private String brand;
    private int price;
    
    // optional attributes
    private boolean BLE;
    private boolean NFC;

    /************************
        PRIVATE constructor    
    *************************/
    private Mobile(Builder builder) {
        this.brand = builder.brand;
        this.price = builder.price;
        this.BLE = builder.BLE;
        this.NFC = builder.NFC;
    }

    public String getBrand() { return brand; }

    public int getPrice() { return price; }

    public boolean isBLE() { return BLE; }

    public boolean isNFC() { return NFC; }
    
    
    /*----------------------------
        inner class : Builder
    -----------------------------*/
    public static class Builder{

        // main attributes
        private String brand;
        private int price;
    
        // optional attributes
        private boolean BLE;
        private boolean NFC;
        
        public Builder(String brand, int price) {
            this.brand = brand;
            this.price = price;
        }

        public Builder setBLE(boolean BLE){
            this.BLE = BLE;
            return this;
        }
        
        public Builder setNFC(boolean NFC){
            this.NFC = NFC;
            return this;
        }
        
        public Mobile build(){
            return new Mobile(this);
        }

    }
        
}
