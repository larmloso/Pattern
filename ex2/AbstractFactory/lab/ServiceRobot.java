class ServiceRobot implements Robot, ServiceRobotable {


    private String name, id;
    private boolean automaticWork, talk;

    public ServiceRobot(){}

    public ServiceRobot(String name, String id, boolean automaticWork, boolean talk){
        this.name = name;
        this.id = id;
        this.automaticWork = automaticWork;
        this.talk = talk;
    }

    public void showInfo(){
        System.out.println("NAME :"+ name + "\nID : " + id + "\nAutomatic Work : "+ this.automaticWork + "\nAutomatic Talking : "+ this.talk + "\n");
    }

    public void talk(){
        System.out.println("Robot automatic talking");
    }


    public void onlineCtrl(){}
    public void walk(){}
    public void turnLeft(){}
    public void turnRight(){}
    public void stop(){}
    public void automaticWork(){}
    public void advice(){}

}