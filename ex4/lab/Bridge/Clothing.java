public abstract class Clothing {

    protected double size;

    protected Color color;
    protected FabricTexture fabrictexture;

    public Clothing(Color color, FabricTexture fabrictexture){
        this.color = color;
        this.fabrictexture = fabrictexture;

    }

    abstract public void applyColor();
    abstract public void applyFabricTexture();
    

    public void setSize(double size){
        this.size = size;
    }

    public double getSize(){
        return this.size;
    }



}