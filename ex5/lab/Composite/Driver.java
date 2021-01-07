public class Driver {

    public static void main(String[] args){

        Shape shape1 = new Shape("triangle");
        Shape shape2 = new Shape("rectangle");

        Structure structure1 = new Structure(1);
        Structure structure2 = new Structure(2);

        structure1.add(shape1);
        structure1.add(shape2);
        structure1.add(structure2);

        structure2.add(shape1);

    
        System.out.println("\nBox A");
        structure1.assemble();

        System.out.println("\nBox B");
        structure2.assemble();

        


        // System.out.println("\nBox B");
        // Structure structure3 = new Structure(3);
        // structure3.add(shape1);
        // structure3.assemble();



    }
}