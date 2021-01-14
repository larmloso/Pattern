public class Equipment implements SeaTrip {
    
  protected SeaTrip seaTrip;
    
  public Equipment(SeaTrip s) {
    this.seaTrip = s;
  }
  
  @Override
  public void assemble() {
    this.seaTrip.assemble();
  }
}