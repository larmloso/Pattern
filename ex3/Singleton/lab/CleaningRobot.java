class CleaningRobot implements Cleaningable, Robot {

    private String name, id;
    private int level;
    private boolean isAutoWork;

    public static CleaningRobot getInstance(){
        return new CleaningRobot();
    }
    public CleaningRobot(){}

    public CleaningRobot(String name, String id, int level, boolean isAutoWork) {
        this.name = name;
        this.id = id;
        this.level = level;
        this.isAutoWork = isAutoWork;
    }


    public void sweep(){
        System.out.println("The robot is sweep the floor");
    }

    public void mopping(){
        System.out.println("The robot is mopping the floor");
    }

    public void showInfo(){
        System.out.println("Name" + name + "Id" + id);
    }

    public void onlineCtrl(){
        ////
    }


}