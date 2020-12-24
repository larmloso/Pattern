public abstract class AbstractRobot implements Robot {

  private String deviceName;
  private boolean isAutomaticWork, isRemoteCtrl;
  protected double batter_mAh;

  public AbstractRobot(String deviceName, double batter_mAh) {
    this.deviceName = deviceName;
    this.batter_mAh = batter_mAh;
  }

  public String getDeviceName(){
    return deviceName;
  }

  public double getBattery() {
    return batter_mAh;
  }

  public boolean isAutomaticWork() {
    return isAutomaticWork;
  }
  
  public void setAutomaticWork(boolean setAutoWork){
    this.isAutomaticWork = setAutoWork;
  }

  public String toString(){
    return "Divice Name : " + this.deviceName + "\n"
            + " Battery : " + this.batter_mAh + " mAh";
  }
  

}
