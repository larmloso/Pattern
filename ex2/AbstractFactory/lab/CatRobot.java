class CatRobot extends Robot {

    public CatRobot(){}

    public CatRobot(String brand, double price){
        this.brand = brand;
        this.price = price;  
    }

    public void showInfo(){
        System.out.println("Cat Robot");
        System.out.println(this.brand + ", " + this.price + "\n");
    }
    
}