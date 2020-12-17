class CleaningRobot implements Prototype {

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
        return "NAME : "+ name + " ID : " + id + "\nLevel : " 
                + level + " Automatic Work : "+ isAutoWork;
    }

    


}