class Driver {
    public static void main(String[] args) {

        Robot cleaningRobot = new Robot.RobotBuilder("cleaning robot", "cln-001", 2).setAutomaticWork(true).build();
        cleaningRobot.showInfo();

        Robot serviceRobot = new Robot.RobotBuilder("cleaning robot", "cln-001").setAutomaticWork(true).setTalk(true).build();
        serviceRobot.showInfo();
    }
}

