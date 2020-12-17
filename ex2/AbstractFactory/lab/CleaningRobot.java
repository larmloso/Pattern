class CleaningRobot implements Robot, CleaningRobotable {


    private String name, id;
    private int level;
    private boolean automaticWork;

    public CleaningRobot(){}

    public CleaningRobot(String name, String id, boolean automaticWork, int level){
        this.name = name;
        this.id = id;
        this.automaticWork = automaticWork;
        this.level = level;
    }

    public void showInfo(){
        System.out.println("NAME :"+ name + "\nID : " + id + "\nAutomatic Work : "+ this.automaticWork);
        System.out.println("Level : " + level + "\n");

    }

    public void sweep(){
        System.out.println("sweep the floor is level : " + level);
    }

    public void mop(){
        System.out.println("Mop the floor is level : " + level);
    }



    public void onlineCtrl(){}
    public void walk(){}
    public void turnLeft(){}
    public void turnRight(){}
    public void stop(){}
    public void automaticWork(){}

}