public class Tshirt extends Clothing {

    public Tshirt(Color color, FabricTexture fabrictexture){
        super(color, fabrictexture);
    }

    @Override
    public void applyColor(){
        System.out.print("T shirt filled with Color : ");
        color.applyColor();
    }

    public void applyFabricTexture(){
        System.out.print("Fabric Texture : ");
        fabrictexture.applyFabricTexture();
    }
}