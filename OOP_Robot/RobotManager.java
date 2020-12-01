class RobotManager {

    public Robot r;

    public void setRobot(Robot r){
        this.r = r;
    }

    public void show(){
        r.display();
        r.walk();
        r.turnLeft();
        r.turnRight();
        r.stop();
    }
        
}