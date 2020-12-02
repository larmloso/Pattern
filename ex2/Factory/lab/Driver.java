class Driver {
    public static void main(String[] args) {

        Robot dogRobot = RobotFactory.createRobot(Robot.DogRobot_type);
        dogRobot.showInfo();

        Robot catRobot = RobotFactory.createRobot(Robot.CatRobot_type);
        catRobot.showInfo();
        
    }
}
