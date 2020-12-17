class Driver {
    public static void main(String[] args) {

        Robot cleaningRobot = RobotFactory.createRobot(new CleaningRobotFactory("Cleaning Robot", "cln-001", true, 1));
        cleaningRobot.showInfo();

        Robot serviceRobot = RobotFactory.createRobot(new ServiceRobotFactory("Service Robot", "sev-002", true, true));
        serviceRobot.showInfo();

        
    }
}
