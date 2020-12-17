
class RobotFactory {

    public static Robot createRobot(String type){
        
        if(type.equals(Robot.cleaningType)){
            return new CleaningRobot("cleanning Robot", "cln-001", true, 2);
        }
        else if(type.equals(Robot.serviceType)){
            return new ServiceRobot("service Robot", "sve-002", true, true);
        } 
        else {
            return null;
        }
    }
}

