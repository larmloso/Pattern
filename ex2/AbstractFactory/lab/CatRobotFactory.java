public class CatRobotFactory implements RobotAbstractFactory {

    private String brand;
    private double price;

    public CatRobotFactory(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    //Override
    public Robot createRobot(){
        return new CatRobot(this.brand, this.price);
    }
}