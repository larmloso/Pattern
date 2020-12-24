public abstract class Clothing {
    
    protected Color color;
    protected FabricTexture fabrictexture;

    public Clothing(Color color, FabricTexture fabrictexture){
        this.color = color;
        this.fabrictexture = fabrictexture;

    }

    abstract public void applyColor();
    abstract public void applyFabricTexture();


}