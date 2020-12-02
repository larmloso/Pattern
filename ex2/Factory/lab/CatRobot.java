class CatRobot extends Robot implements Robotable {

    public CatRobot(){}

    public CatRobot(String brand, double price, String name, String id){
        this.brand = brand;
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public void showInfo(){
        System.out.println("Cat Robot");
        System.out.println(this.brand + ", " + this.price + ", " + this.name + ", " + this.id);
    }
    

    public  void walk(){}
    public  void turnLeft(){}
    public  void turnRight(){}
    public  void stop(){}
}