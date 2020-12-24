
class Driver {

  public static void main(String[] args) {

    CleaningRobot cln = new CleaningRobot("cleaning-rb", 3500);  // devicename & SizeBattery 
    System.out.println("Device Name : "+ cln.getDeviceName());
    System.out.println("Battery : " + cln.getBattery() + " minutes of use. \n");

    RobotAdapter adt = new RobotAdapter(new RemoteCtrl("remote-ctrl", 2000));
    System.out.println("Device Name : "+ adt.getDeviceName());
    System.out.println("Battery : " + adt.getBattery() + " minutes of use. \n");
  }
}
