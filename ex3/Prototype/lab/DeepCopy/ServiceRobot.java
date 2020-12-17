
import java.io.Serializable;
class ServiceRobot implements Serializable, Serviceable, Robot {

    private String name, id;
    private boolean isAutoWork, isAutoTalk;


    public ServiceRobot(String name, boolean isAutoWork, boolean isAutoTalk) {
        this.name = name;
        this.isAutoWork = isAutoWork;
        this.isAutoTalk = isAutoTalk;
    }

    public void serveFood(){
        System.out.println("Robots are serving food");
    }
    public void talking(){
        System.out.println("The robot is talking");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setID(String id){
        this.id = id;
    }
    public void setIsAutoTalk(boolean isAutoTalk){
        this.isAutoTalk = isAutoTalk;
    }
    public void setIsAutoWork(boolean isAutoWork){
        this.isAutoWork = isAutoWork;
    }

    public String toString() {
        return "NAME : " + name + " Automatic Talk : " + isAutoTalk + " Automatic Work : " + isAutoWork;
    }

    public void showInfo(){
        System.out.println("Name" + name + "Id" + id);
    }

    public void onlineCtrl(){
        ////
    }
}