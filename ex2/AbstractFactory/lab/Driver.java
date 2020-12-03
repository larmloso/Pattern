class Driver {
    public static void main(String[] args) {

        Robot catRobot = RobotFactory.createRobot(new CatRobotFactory("cat-Brand", 1800.00));
        catRobot.showInfo();
        
        Robot dogRobot = RobotFactory.createRobot(new DogRobotFactory("dog-Brand", 2000.00));
        dogRobot.showInfo();
        
    }
}
