public class ShapeFacade {

    private Shape shape1, shape2;
    private Structure structure1, structure2;

    public ShapeFacade(){

        this.shape1 = new Shape("triangle");
        this.shape2 = new Shape("rectangle");

        this.structure1 = new Structure(1);
        this.structure2 = new Structure(2);
    }

    public void start() {

        structure1.add(this.shape1);
        structure1.add(this.shape2);
        structure1.add(this.structure2);
        structure2.add(this.shape1);

        System.out.println("\nBox A");
        structure1.assemble();

        System.out.println("\nBox B");
        structure2.assemble();
    }
}