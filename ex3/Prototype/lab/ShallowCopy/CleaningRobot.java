class CleaningRobot implements Prototype, Robot, Cleaningable {

    private String name, id;
    private int level;
    private boolean isAutoWork;

    public CleaningRobot(String name, String id, int level, boolean isAutoWork) {
        this.name = name;
        this.id = id;
        this.level = level;
        this.isAutoWork = isAutoWork;
    }

    public Prototype doClone(){
        return new CleaningRobot(name, id, level , isAutoWork);
    }

    public String toString() {
        return "NAME : "+ name + ", ID : " + id + "\nLevel : " 
                + level + ", Automatic Work : "+ isAutoWork;
    }

    public void showInfo(){
        System.out.println("Name" + name + "Id" + id);
    }

    public void onlineCtrl(){
        ////
    }

    public void sweep(){
        System.out.println("The robot is sweeping the floor.");
    }
    public void mopping(){
        System.out.println("The robot is mopping the floor.");
    }



}