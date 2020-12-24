class CleaningRobot extends AbstractRobot {

  final private double volts = 14;
  final private double watts = 25;

  public CleaningRobot(String deviceName, double batter_mAh) {
    super(deviceName, batter_mAh);
    setAutomaticWork(true);
  }

  public double getBattery(){
    final double hours = (batter_mAh * volts)/(watts * 1000);
    return hours * 60;
  }

  
  /// Method implements from interface class CleaningAble
  // public void sweep(){
  //   System.out.println("The robot is sweeping the floor.");
  // }

  // public void mopping(){
  //   System.out.println("The robot is sweeping the floor.");
  // }

  
}
