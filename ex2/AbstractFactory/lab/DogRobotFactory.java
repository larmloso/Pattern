public class DogRobotFactory implements RobotAbstractFactory {

    private String brand;
    private double price;

    public DogRobotFactory(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    //Override
    public Robot createRobot(){
        return new DogRobot(this.brand, this.price);
    }
}