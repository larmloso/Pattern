class ServiceRobot implements Prototype {

    private String name, id;
    private boolean isAutoWork, isAutoTalk;

    public ServiceRobot(String name, String id, boolean isAutoWork, boolean isAutoTalk){
        this.name = name;
        this.id = id;
        this.isAutoWork = isAutoWork;
        this.isAutoTalk = isAutoTalk;
    }

    public Prototype doClone(){
        return new ServiceRobot(name, id, isAutoWork, isAutoTalk);
    }

    public String toString() {
        return "NAME : "+ name + " ID : " + id + "\nAutomatic Talking : " 
                + isAutoTalk + " Automatic Work : "+ isAutoWork;
    }
}