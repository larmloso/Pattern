public class RobotAdapter extends AbstractRobot {

    //adaptree 
    private RemoteCtrl remoteCtrl;

    public RobotAdapter(final RemoteCtrl remoteCtrl){
        super(remoteCtrl.getRemoteName(), remoteCtrl.getRemoteBattery());
        setAutomaticWork(false);
        this.remoteCtrl = remoteCtrl;
    }

    @Override
    public double getBattery(){
        final double watts = remoteCtrl.getWatts();
        final double volts = remoteCtrl.getVots();
        
        final double hours = (batter_mAh * volts)/(watts * 1000);
        return hours * 60;
    }
}