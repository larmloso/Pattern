

public class Block implements Group {

    int width, height;
    
    public Block(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public void assemble() {
        System.out.print(" Block" + width + "x" + height + "\n");
    }
}
