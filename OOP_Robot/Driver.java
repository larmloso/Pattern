class Driver {
    public static void main(String[] args){

        RobotManager rm = new RobotManager();
        rm.setRobot(new RobotA("robot-a", "rb-002"));
        rm.show();


        rm.setRobot(new RobotB("robot-b", "rb-0033"));
        rm.show();

        
        // RobotA ra = new RobotA("robot--a", "rr-002", "stop");
        // ra.display();

        

    }
}