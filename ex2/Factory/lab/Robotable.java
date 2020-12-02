public interface Robotable {

    public static final String DogRobot_type = "DogRobotType";
    public static final String CatRobot_type = "CatRobotType";

    public abstract void showInfo();
    public abstract void walk();
    public abstract void turnLeft();
    public abstract void turnRight();
    public abstract void stop();


}