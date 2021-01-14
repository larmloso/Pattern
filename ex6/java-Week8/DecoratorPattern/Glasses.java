public class Glasses extends Equipment {

    public Glasses(SeaTrip s) {
        super(s);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Swimming goggles ");
    }
} 