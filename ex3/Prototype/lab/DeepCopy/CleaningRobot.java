
import java.io.Serializable;
class CleaningRobot implements Serializable, Cleaningable, Robot {

    private String name, id;
    private int level;
    private boolean isAutoWork;


    public CleaningRobot(String name, int level, boolean isAutoWork) {
        this.name = name;
        this.level = level;
        this.isAutoWork = isAutoWork;
    }

    public void sweep(){
        System.out.println("The robot is sweeping the floor.");
    }
    public void mopping(){
        System.out.println("The robot is mopping the floor.");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setID(String id){
        this.id = id;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setIsAutoWork(boolean isAutoWork){
        this.isAutoWork = isAutoWork;
    }

    public String toString() {
        return "NAME : " + name + " Level : " + level + " Automatic Work : " + isAutoWork;
    }

    public void showInfo(){
        System.out.println("Name" + name + "Id" + id);
    }

    public void onlineCtrl(){
        ////
    }
}