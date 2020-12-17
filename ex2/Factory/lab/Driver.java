class Driver {
    public static void main(String[] args) {

        Robot cleaningRobot = RobotFactory.createRobot(Robot.cleaningType);
        cleaningRobot.showInfo();

        Robot serviceRobot = RobotFactory.createRobot(Robot.serviceType);
        serviceRobot.showInfo();

        
    }
}
