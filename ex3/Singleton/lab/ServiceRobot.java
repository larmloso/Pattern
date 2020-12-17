class ServiceRobot implements ServiceRobotable {

    private String name, id;
    private boolean isAutoWork, isAutoTalk;

    public static ServiceRobot getInstance(){
        return new ServiceRobot();
    }
    public ServiceRobot(){}

    public ServiceRobot(String name, String id, boolean isAutoWork, boolean isAutoTalk){
        this.name = name;
        this.id = id;
        this.isAutoWork = isAutoWork;
        this.isAutoTalk = isAutoTalk;
    }

    public void serveFood(){
        System.out.println("Robots are serving food");
    }

    public void talk(){
        System.out.println("The robot is talking");
    }

    

}