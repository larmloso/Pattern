
import java.io.Serializable;
class CleaningRobot implements Serializable {

    private String name, id;
    private int level;
    private boolean isAutoWork;


    public CleaningRobot(String name, int level, boolean isAutoWork) {
        this.name = name;
        this.level = level;
        this.isAutoWork = isAutoWork;
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
}