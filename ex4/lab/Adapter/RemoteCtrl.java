public class RemoteCtrl {

    private String deviceName;
    private double batter_mAh;

    final private double volts = 8.4;
    final private double watts = 3.0;

    public RemoteCtrl(String deviceName, final double batter_mAh){
        this.batter_mAh = batter_mAh;
        this.deviceName = deviceName;
    }

    public String getRemoteName(){
        return deviceName;
    }

    public double getRemoteBattery(){
        return this.batter_mAh;
    }

    public double getVots(){
        return this.volts;
    }

    public double getWatts(){
        return this.watts;
    }


}