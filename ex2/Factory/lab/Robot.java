public interface Robot {

    public static final String cleaningType = "cleaningType";
    public static final String serviceType = "serviceType";

    public abstract void showInfo();
    public abstract void onlineCtrl();
    public abstract void automaticWork();

    public abstract void walk();
    public abstract void turnLeft();
    public abstract void turnRight();
    public abstract void stop();

}