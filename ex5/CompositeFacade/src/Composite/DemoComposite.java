

public class DemoComposite {

    public static void main(String[] args) {
        
        // We have 3 types of Block(width, height)
        Block block1 = new Block(1,1);
        Block block2 = new Block(2,1);
        Block block3 = new Block(2,2);

        //=============================
        // Organization A
        //
        Structure structure1 = new Structure(1);
        Structure structure2 = new Structure(2);
        Structure structure3 = new Structure(3);

        //Composes the groups
        structure1.add(block1);
        structure1.add(block2);

        structure2.add(block1);
        structure2.add(block3);

        structure3.add(block2);
        structure3.add(structure1);
        structure3.add(structure2);

        System.out.println("Organization A");        
        structure3.assemble();
        
        //=============================
        // Organization B
        //        
        Structure structure4 = new Structure(4);
        structure4.add(block3);
        System.out.println("Organization B");
        structure4.assemble();
        
    }
}
