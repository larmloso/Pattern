public class CleaningRobotFactory implements RobotAbstractFactory {

    private String name,id;
    private int level;
    private boolean automaticWork;

    public CleaningRobotFactory(String name, String id, boolean automaticWork, int level){
        this.name = name;
        this.id = id;
        this.automaticWork = automaticWork;
        this.level = level;
    }

    //Override
    public Robot createRobot(){
        return new CleaningRobot(this.name, this.id, this.automaticWork, this.level);
    }
}