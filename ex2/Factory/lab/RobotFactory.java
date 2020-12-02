
class RobotFactory {

    public static Robot createRobot(String type){
        
        if(type.equals(Robot.DogRobot_type)){
            return new DogRobot("dogBrand", 1900.00, "dogName", "dog-001");
        }
        else if(type.equals(Robot.CatRobot_type)){
            return new CatRobot("CatBrand", 1500.00, "catName", "cat-001");
        }
        else {
            return null;
        }
    }
}

