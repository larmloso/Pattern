class DogRobot extends Robot {

    public DogRobot(){}

    public DogRobot(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("Dog Robotssss");
        System.out.println(this.brand + ", " + this.price + "\n");
    }


}