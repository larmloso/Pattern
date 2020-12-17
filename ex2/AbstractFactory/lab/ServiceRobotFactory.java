public class ServiceRobotFactory implements RobotAbstractFactory {

    private String name,id;
    private boolean automaticWork, talk;

    public ServiceRobotFactory(String name, String id, boolean automaticWork, boolean talk){
        this.name = name;
        this.id = id;
        this.automaticWork = automaticWork;
        this.talk = talk;
    }

    //Override
    public Robot createRobot(){
        return new ServiceRobot(this.name, this.id, this.automaticWork, this.talk);
    }
}