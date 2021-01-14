public class DemoSeaTrip {

    public static void main(String[] args) {
        SeaTrip glasses = new Glasses(new SeaTripSet() );
        glasses.assemble();
        System.out.println("");

        SeaTrip rubberringglasses = new Glasses( new RubberRing( new SeaTripSet() ));
        rubberringglasses.assemble();
    }
}