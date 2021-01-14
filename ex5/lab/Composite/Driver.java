public class Driver {

    public static void main(String[] args){

        Shape triangle = new Shape("triangle");
        Shape rectangle = new Shape("rectangle");

        Structure structure1 = new Structure(1);
        Structure structure2 = new Structure(2);

        structure1.add(triangle);
        structure1.add(rectangle);
        structure2.add(triangle);

        structure1.add(structure2);

    
        System.out.println("\nBox A");
        structure1.assemble();

        System.out.println("\nBox B");
        structure2.assemble();

        

    }
}