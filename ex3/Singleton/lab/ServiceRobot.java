class ServiceRobot implements Serviceable, Robot{

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

    public void talking(){
        System.out.println("The robot is talking");
    }

    public void showInfo(){
        System.out.println("Name" + name + "Id" + id);
    }

    public void onlineCtrl(){
        ////
    }

    

}